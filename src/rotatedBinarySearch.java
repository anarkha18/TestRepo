public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2,3};
        int start = 0;
        int end = arr.length-1;

        int pivot = findPivot(arr, start, end);
        System.out.println(pivot);
    }
    static int findPivot(int[] arr, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start &&   arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] > arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}