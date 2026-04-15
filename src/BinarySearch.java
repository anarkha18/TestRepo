import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("Enter elements of the array : ");
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter target variable: ");
        System.out.println(binarySearch(arr, sc.nextInt()));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
/*Algorithm:
1. Consider the array is already sorted in asc order
2. start is starting index of the array
3. end is length -1 of the array
4. while start is not greater than end
5. find mid element and then compare it with target until target is found
6. if target is greater than mid then traverse to the right
    - The starting index will be middle +1
7. if the target is less than mid then the target is in left side so traverse to the left
    - The end index will be  middle -1
8. return mid if target == mid
9. otherwise return -1 if target is not found

Time complexity
best case O(1)
worst case = 0(log2N) -> log N to the base 2

ORDER AGNOSTIC BINARY SEARCH

1. The array is sorted but we dont know in which way it is sorted asc or dec
2. Check whether start is greater than end
    - It is dec order else it is sorted in asc order
3. if desc order then the logic is reverse
4. if target is greater than mid then traverse to the left
    - The end index will be middle -1
5. if the target is less than mid then the target is in right side so traverse to the right
    - The start index will be  middle +1
 */

