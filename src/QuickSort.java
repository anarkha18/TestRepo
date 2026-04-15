import java.util.Arrays;
//hoare partition algorithm of quick sort
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,9,12,10,1,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int j = partitioning(arr, low, high);
            quickSort(arr, low, j);
            quickSort(arr, j + 1, high);
        }
    }

    public static int partitioning(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while(true){
            do{
                i ++;
            } while(arr[i] < pivot);

            do{
                j --;
            } while(arr[j] > pivot);

            if(i >= j){
                return j;
            }
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
