import java.util.Arrays;

public class recursion2 {
    public static void main(String[] args) {
        //int n = 1444561;
        int[] arr = {5,3,4,2,7,6};
        //row is len -1 otherwise will cause index out of bound exception
        //bubble(arr,5,0);
        selection(arr, 6,0,0);
        //insertion(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
        //int target = 2;
        //pattern(4,0);
        //patternTriangle(4,0);
        //System.out.println(linearSearch(arr, target, 0));
        //System.out.println(printFactorial(n));
        //System.out.println(sumOfDigits(n));
    }

    public static int printFactorial(int n) {
        if(n == 1){
            return 1;
        }
        return n * printFactorial(n-1);
    }

    public static int sumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return ( n % 10 )+ sumOfDigits( n / 10);
    }

    public static boolean linearSearch(int[] arr, int target, int c) {
        if( c == arr.length) {
            return false;
        }
        return  (arr[c] == target) || linearSearch(arr, target, c+1);
    }

     public static void pattern(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            System.out.print("*"+ " ");
            pattern(row, column+1);
        }
        else{
            System.out.println();
            pattern(row-1, 0);
        }
     }

    public static void patternTriangle(int row, int column){
        if(row == 0){
            return;
        }
        if(column < row){
            patternTriangle(row, column+1);
            System.out.print("*"+ " ");
        }
        else{
            patternTriangle(row-1, 0);
            System.out.println();
        }
    }

    public static void bubble(int[] arr, int row, int index){
        if(row == 0){
            return;
        }
        if(index < row){
            if(arr[index] > arr[index+1]){
                int temp = arr[index+1];
                arr[index+1] = arr[index];
                arr[index] = temp;
            }
            bubble(arr, row, index+1);
        }
        else{
            bubble(arr,row-1, 0);

        }
    }

    public static void selection(int[] arr, int row, int index, int maxIndex){
        if(row == 0){
            return;
        }
        if(index < row){
            if(arr[index] >= arr[maxIndex]){
                maxIndex = index;
            }
            selection(arr, row, index+1, maxIndex);
        }
        else{
            int temp = arr[row -1];
            arr[row-1]= arr[maxIndex];
            arr[maxIndex] = temp;
            selection(arr,row-1, 0, 0);
        }
    }

    public static void insertion(int[] arr, int row, int index){
        if(row == arr.length - 1 ){
            return;
        }
        if(index > 0 && arr[index] < arr[index-1]){
            int temp = arr[index];
            arr[index]= arr[index-1];
            arr[index-1] = temp;
            insertion(arr, row, index-1);
        }
        else{
            insertion(arr,row+1, row+2);
        }
    }
}
