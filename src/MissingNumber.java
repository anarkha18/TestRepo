import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={3,2,4,1,0};
        int result = missingNum(arr);
        System.out.println(result);
    }

    static int missingNum(int[] arr) {
        int i = 0;
        while ( i < arr.length ){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                int temp =  arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return  arr.length;
    }
}

