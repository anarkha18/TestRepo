import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAll {
    public static void main(String[] args) {
        int[] arr ={6,2,4,6,6,6,3};
        List<Integer> result = findMissing(arr);
        System.out.println(result);
    }

    static List<Integer> findMissing(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while ( i < arr.length ){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                int temp =  arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                result.add(j+1);
            }
        }
        return  result;
    }
}

