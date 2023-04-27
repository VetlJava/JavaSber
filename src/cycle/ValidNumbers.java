package cycle;
/**
 * Напишите программу с интерактивным циклом проверки правильности
 * ввода данных, считывающую пары целых чисел до тех пор, пока не
 * встретит пару, в которой одно из чисел кратно другому.
 */

import java.util.Scanner;

public class ValidNumbers {
    public static void main(String[] args) {
        int value1, value2, count = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите первое целое число: ");
            value1 = input.nextInt();
            System.out.print("Введите второе целое число: ");
            value2 = input.nextInt();
            count++;
        } while (value1 != value2);
        System.out.println("Цифры валидны");
        System.out.println("Вы ввели " + count + " раз");
    }
}
