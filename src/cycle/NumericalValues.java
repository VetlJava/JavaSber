package cycle;
/**
 * Напишите программу, которая запрашивает у пользователя
 * числовые значения, а выводит количество положительных и
 * количество отрицательных введенных значений.
 * Сигнальная метка 0
 */
import java.util.Scanner;

public class NumericalValues {
    public static void main(String[] args) {
        int     value,
                positive = 0,
                negative = 0;
        final int STOP = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите чило: ");

        value = input.nextInt();
        while (value != STOP) {
            if (value < 0) {
                negative++;
            } else if (value > 0){
                positive++;
            }
            System.out.println("Введите следущее число: ");
            value = input.nextInt();
        }
        System.out.println("Положительных значений: " + positive
                + "\nОтрицательных значений: " + negative);
    }
}
