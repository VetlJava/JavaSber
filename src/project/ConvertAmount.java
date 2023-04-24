package project;

import java.util.Scanner;
/*
Программа конвертации суммы денег из USD  в RUB по курсу 72.12
 */
public class ConvertAmount {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; //курс покупки
        int dollars, digit;
        double roubles;

        Scanner input = new Scanner(System.in); //Получить сумму денег в американских долларах

        System.out.println("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();
        System.out.print(dollars);

        if (dollars >= 5 && dollars <= 20) {
            System.out.println(" американских долларов равны");
        } else {
            digit = dollars % 10;
            if (digit == 1) {
                System.out.println(" американский доллар равен");
            } else if (digit >= 2 && digit <= 4) {
                System.out.println(" американских доллара равны");
            } else System.out.println(" американских долларов равны");
        }

        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.print((int)(roubles * 100) / 100.0 + " российского рубля.");

    }
}
