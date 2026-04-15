package subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetArr {
    public static void main(String[] args) {
        int[] input = {1,2,2};
        //return all combinations in an array list using for loop
        //ArrayList<ArrayList<Integer>> result = subsetOfArr(input);
        ArrayList<ArrayList<Integer>> result = subsetOfArrDuplicate(input);
        for (ArrayList<Integer> i : result){
            System.out.println(i);
        }
    }

    public static ArrayList<ArrayList<Integer>> subsetOfArr(int[] input) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int n : input){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(n);
                outer.add(inner);
            }
        }
        return outer;

    }

    public static ArrayList<ArrayList<Integer>> subsetOfArrDuplicate(int[] input) {
        Arrays.sort(input);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        //if duplicate is detected add the duplicated element only to the newly added elements in the previous array
        for (int i = 0; i < input.length; i ++){
            if(i > 0 && input[i] == input[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int size = outer.size();
            for (int j = start; j < size; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(input[i]);
                outer.add(inner);
            }
        }
        return outer;

    }
}
