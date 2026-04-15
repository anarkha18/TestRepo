import java.util.Scanner;

public class SplitArraySum {
    public static void main(String[] args) {
        int[] nums = {10,3,5,17,20,21};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0; //find the max element in thr array
        int end = 0; // find the sum of all elements in the array
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int arrCount = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    arrCount++;
                    sum = num;
                } else {
                    sum += num;
                }
            }

            if(arrCount<= k){
                end = mid;
            }else{
                start = mid+1;
            }

        }
        return end;
    }

}
