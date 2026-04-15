import java.util.Arrays;
/*Steps
1. Start from the beginning of the array
2. For each position i from 0 to n-2 (the first index will always be sorted after all the iterations hence n-2 passes)
 - Find the maximum element in the range 0 to n-i-1
 (we won't be checking into already sorted elements, hence n-i-1)
3. Swap it with the element at position n-i-1
4. Repeat until the array is sorted */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={5,4,7,2,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int start = 0;
            int end = arr.length-i-1;
            int maxIndex = findMaxIndex(arr, start, end);
            swapp(arr, maxIndex, end);
        }
    }

    static void swapp(int[] arr, int maxIndex, int end) {
        int temp = arr[end];
        arr[end] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
