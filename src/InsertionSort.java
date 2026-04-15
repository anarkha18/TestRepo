import java.util.Arrays;
/*
Insertion Sort Algorithm (Using Swap)
1. Start from the first index (0).
2. For each element, take the next element as j = (i+1).
3. Compare it with elements to its left.
4. If it is smaller, swap with the previous element.
5. Continue swapping backward until it reaches the correct position.
6. Repeat for all elements.*/
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={1,2,10,7,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j =  i + 1 ; j > 0; j--){
                if(arr[j]  < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
