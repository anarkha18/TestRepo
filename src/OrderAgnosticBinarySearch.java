import java.util.Scanner;

public class OrderAgnosticBinarySearch {
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
        boolean isAsc = arr[start]<arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid +1;
                } else if (target < arr[mid]) {
                    end = mid -1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid +1;
                } else if (target > arr[mid]) {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
