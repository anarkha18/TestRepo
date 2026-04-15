import java.util.Arrays;
/*Steps
1. Start from index 1
2. Compare arr[j] and arr[j-1]
3. Swap if arr[j] < arr[j-1]
4. Continue till end of array
5. After each pass, reduce range (n - i - 1)
6. Repeat for n - 1 passes*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,2,10,7,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int  i = 0; i < arr.length ; i++) {
            swapped = false;
            for(int j=1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
