import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        ArrayList<Object> st5 = new ArrayList<>();
        st5.add("steve");
        Main m = new Main();
        Main.Sain s = m.new Sain();
        System.out.println("st5"+ s.x);
        String s2 = "java";
    }
    class Sain{
        int x = 10;
    }

}