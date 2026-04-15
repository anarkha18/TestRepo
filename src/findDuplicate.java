import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr ={4,2,3,3,1};
        int result = findDup(arr);
        System.out.println(result);
    }

    static int findDup(int[] arr) {
        int i = 0;
        while ( i < arr.length ){
            if(arr[i] != i+1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]) {
                    int temp = arr[correctIndex];
                    arr[correctIndex] = arr[i];
                    arr[i] = temp;
                }else{
                    return arr[i];
                }
            }else {
                i++;
            }

        }
        return -1;
    }
}
