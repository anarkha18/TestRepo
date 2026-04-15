import java.util.Arrays;
/*Algorithm (Step-by-step)
1. Initialize i = 0
2. While i < n:
3. Find the correct index of the current element:
4. correctIndex = arr[i] - 1
5. If arr[i] is not at its correct position:
6. Swap arr[i] with arr[correctIndex]
   Else:
7. Increment i
8. Repeat until all elements are placed correctly
Only possible for a continuous array of elements from 1 to n or 0 to n-1 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={3,2,5,4,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while ( i < arr.length ){
           int correctIndex = arr[i] - 1; //find the correct index of the element
           if(arr[i] != arr[correctIndex]) {
               int temp =  arr[correctIndex];
               arr[correctIndex] = arr[i];
               arr[i] = temp;
           }else {
               i++;
           }
        }
    }
}
