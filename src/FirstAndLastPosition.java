public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] arr = {2,8,9,9,9,13,20};

        int first = search(arr, 9, true);
        int last = search(arr, 9, false);

        System.out.println(first + " " + last);
    }

    static int search(int[] arr, int target, boolean findFirst){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{

                ans = mid;

                if(findFirst){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}