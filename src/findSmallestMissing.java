public class findSmallestMissing {
    public static void main(String[] args) {
        int[] arr ={3,-1,0,1};
        int result = missingNum(arr);
        System.out.println(result);
    }

    static int missingNum(int[] arr) {
        int i = 0;
        while ( i < arr.length ){
            int correctIndex = arr[i] - 1;
            if(arr[i] < arr.length &&  arr[i] > 0 && arr[i] != arr[correctIndex]) {
                int temp =  arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j +1 ;
            }
        }
        return  arr.length;
    }
}

