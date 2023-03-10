import java.util.Scanner;
    /*
    Программа TestBooleanOperators проверяет, делится ли нацело число:
        на 2 И на 3;
        на 2 ИЛИ на 3;
        на 2 ИЛИ на 3, но не на оба.
     */

public class TestBooleanOperators {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число ");
        number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " делится нацело на 2 и на 3");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " делится нацело на 2 или на 3");
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " делится нацело на 2 или на 3, но не на оба");
        } else {
            System.out.println("Число " + number + " не делится нацело на 2 или на 3");
        }
    }
}
