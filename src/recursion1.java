public class recursion1 {
    public static void main(String[] args) {
        int n = 10;
        recursionPrint(n);
        System.out.println();
        recursionPrintRev(n);
    }

    public static void recursionPrint(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        recursionPrint(n-1);
    }

    public static void recursionPrintRev(int n) {
        if(n == 0) {
            return;
        }
        recursionPrintRev(n-1);
        System.out.print(n + " ");
    }
}
