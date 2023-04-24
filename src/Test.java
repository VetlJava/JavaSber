import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        System.out.println(x > 0 && x < 10);
//        System.out.println((x > 0) && (x < 10));
//
//        System.out.println(x > 0 || x < 10);
//        System.out.println((x > 0) || (x < 10));
//
//        System.out.println(x > 0 || x < 10 && y < 0);
//        System.out.println(x > 0 || (x < 10 && y < 0));
       // System.out.println(1+1+1+1+1 == 5);

//        System.out.println(x != y);
//        System.out.println(!(x == y));
//        System.out.println(x > y && x < y);
//        System.out.println((int) '1');
//        System.out.println((int) 'A');
//        System.out.println((int) 'a');
//
//        System.out.println((char) 40);
//        System.out.println((char) 90);
//        System.out.println((char) 0X90);

//        int x = 'a';
//        System.out.println(++x);
//        int c = 'A';
//        int i = (int) c;
        String s1 = "Welcome";
        String s2 = "welcome";

        boolean isEqual = s1.equals(s2);
        System.out.println("1. " + isEqual);

        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println("2. " + isEqual);

        int x = s1.compareTo(s2);
        System.out.println("3. x: " + x);

        x = s1.compareToIgnoreCase(s2);
        System.out.println("4. " + x);

        boolean b = s1.startsWith("AAA");
        System.out.println("5. префикс b: " + b);

        b = s1.endsWith("AAA");
        System.out.println("6. суфикс b: " + b);

        x = s1.length();
        System.out.println("7. "  + x);

        x = (char) s1.charAt(0);
        System.out.println("8. " + x);

        String s3 = s1 + s2;
        System.out.println("9. " + s3);


    }
}
