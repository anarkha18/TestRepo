import java.util.Arrays;

public class mergeSortEx {
    public static void main(String[] args) {
        int[] arr = {5,7,1,3,2,8,10};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left =  mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int[] mergearr = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < left.length && j < right.length){
            if(left[i] < right[j]){
                mergearr[k] = left[i];
                k ++;
                i ++;
            }
            else{
                mergearr[k] = right[j];
                k ++;
                j ++;
            }
        }

        while ( i < left.length){
            mergearr[k] = left[i];
            k ++;
            i ++;
        }
        while ( j < right.length){
            mergearr[k] = right[j];
            k ++;
            j ++;
        }

        return mergearr;

    }
}
