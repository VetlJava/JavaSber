import java.util.Scanner;

public class SimpleIfDemo {
    /*
    SimpleIfDemo предлагает пользователю ввести целое число.
    Если число кратно 5, то отображается Кратно 5.
    Если число делится на 2 без остатка, то отображается Четное.
     */
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число ");

        x = input.nextInt();
        if (x % 5 == 0) {
            System.out.println("Кратно 5");
        }
        if (x % 2 == 0) {
            System.out.println("Чётное");
        }
    }
}
