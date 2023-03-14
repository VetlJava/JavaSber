import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int x = 11, y = 1 ;
        System.out.println(x > 0 && x < 10);
        System.out.println((x > 0) && (x < 10));

        System.out.println(x > 0 || x < 10);
        System.out.println((x > 0) || (x < 10));

        System.out.println(x > 0 || x < 10 && y < 0);
        System.out.println(x > 0 || (x < 10 && y < 0));
    }
}
