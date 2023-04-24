import java.util.Scanner;

public class StriingExample1 {
    // считывание строк из консоли
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5;
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите три слова через пробел: ");

        s1 = input.next();
        s2 = input.next();
        s3 = input.next();

        System.out.println("s1 равно: " + s1);
        System.out.println("s2 равно: " + s2);
        System.out.println("s3 равно: " + s3);

        System.out.print("Введите целую строку: ");

        Scanner input2 = new Scanner(System.in);
        s4 = input2.nextLine();
        System.out.println("s4 равно: " + s4);

        System.out.println("Введите слово: ");
        Scanner input3 = new Scanner(System.in);
        s5 = input3.nextLine();
        ch = s5.charAt(1);
        System.out.println("Второй символ в слове равен: " + ch);

    }
}
