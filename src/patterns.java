public class patterns {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern1(int n){
        for (int i = 1; i < 2*n ; i++) {
            int columns = i > n ? 2*n - i : i;
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1; i < 2*n ; i++) {
            int columns = i > n ? 2*n - i : i;
            int spaces = n - columns;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
