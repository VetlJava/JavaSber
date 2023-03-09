package project;

import java.util.Scanner;
/*
Программа конвертации суммы денег из USD  в RUB по курсу 72.12
 */
public class ConvertAmount {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; //курс покупки
        int dollars;
        double roubles;

        Scanner input = new Scanner(System.in); //Получить сумму денег в американских долларах

        System.out.println("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();

        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println("Она равна " + (int)(roubles * 100) / 100.0 + " российского рубля.");

    }
}
