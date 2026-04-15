public class permutations {
    public static void main(String[] args) {
        //find all combinations
        String input = "abcd";
        //findCombinations("", input);
        System.out.println(findCombinationsCount("", input));
    }

    public static void findCombinations(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);
        //p is the number of recursive fun calls required at certain level
        int p = processed.length() + 1;
        for (int i = 0; i < p ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            findCombinations(first + ch + second, unProcessed.substring(1));

        }
    }

    public static int findCombinationsCount(String processed, String unProcessed) {
        int count = 0;
        if(unProcessed.isEmpty()){
            return 1;
        }

        char ch = unProcessed.charAt(0);
        //p is the number of recursive fun calls required at certain level
        int p = processed.length() + 1;
        for (int i = 0; i < p ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            count = count + findCombinationsCount(first + ch + second, unProcessed.substring(1));

        }

        return count;
    }


}
