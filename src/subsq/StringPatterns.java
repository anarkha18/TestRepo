package subsq;

public class StringPatterns {
    public static void main(String[] args) {
        String pattern = "abc";
        printCombination( "", pattern);
    }
    //processed new string, unprocessed is input string
    public static void printCombination(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }
        char ch = unProcessed.charAt(0);
        printCombination(processed+ch, unProcessed.substring(1));
        printCombination(processed, unProcessed.substring(1));
    }
}
