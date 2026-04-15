import java.util.Scanner;

public class sealOfNumber {
    /*seal of a given number means ->
    the smallest number that is greater than or equal to the give target number in the array.*/
    public static void main(String[] args) {
        System.out.println("Find seal of a given number in an sorted array with asc order ");
        int[] arr = {2,4,8,9,13,15,16,20};
        /*
        for 9 -> seal is 9
        for 10 -> seal is 13
        */
        System.out.println("Enter target element: ");
        System.out.println("The seal of the number is : " + findSeal(arr, new Scanner(System.in).nextInt()));

    }
    static int findSeal(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                return arr[mid];
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
        if(isAsc)
            return arr[start]; //asc
        else
            return arr[end]; // desc
    }
    /*For floor -> means greatest number which is less than or equal to the given target number
    int[] arr = {2,4,8,9,13,15,16,20};
    floor of 9 -> 9
    floor of 10 -> 9
     if(isAsc)
         return end; //asc
     else
        return start; // desc
     */

}
