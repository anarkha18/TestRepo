public class findFloor {
    public static void main(String[] args) {
        int[] arr = {2,8,9,9,9,13,20};

        int floor = search(arr, 13);
        System.out.println(floor);
    }
    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
