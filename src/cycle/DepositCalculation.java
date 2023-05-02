package cycle;
/**
 * Расчет процентов и дохода по вкладу
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DepositCalculation {
        static final int MONTHS_OF_YEAR = 12;   // месяцев года
        static final int DAYS_YEAR = 365;   // дней в году

    public static void main(String[] args) {
        int startMonth; // номер месяца открытия вклада
        int startYear;  // год открытия вклада
        int depositTerm;    //срок вклада в месяцах
        double rate;    // процентная ставка
        double depositAmount; //сумма вклада
        double accruedInterestPerMonth; // доход по вкладу в текущем месяце
        double accruedInterestTotal = 0;    // сумма дохода по вкладу

        Scanner input = new Scanner(System.in);

//        Получить номер месяца открытия вклада
        System.out.print("Введите номер месяца открытия вклада: ");
        startMonth = input.nextInt();

//        Получить год открытия вклада
        System.out.print("Введите год открытия вклада: ");
        startYear = input.nextInt();

//        Получить срок влада в месяцах
        System.out.print("Введите срок вклада в месяцах: ");
        depositTerm = input.nextInt();

//        Получить сумму вклада в рублях
        System.out.print("Введите сумму вкалада: ");
        depositAmount = input.nextInt();

//        Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку: ");
        rate = input.nextInt();

        int monthsCount = 0;    //счетчик месяцев
        int i = startYear;  //год
        while (monthsCount < depositTerm) {
            for (int j = 1; j <= MONTHS_OF_YEAR; j++) {
                if (i == startYear && j <= startMonth){
                    continue;
                }
                if (monthsCount == depositTerm){
                break;
                }

//              Получаем количество дней в текущем месяце
                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();

//                Расчет дохода по вкладу в текущем месяце
                accruedInterestPerMonth = depositAmount * rate / 100 / DAYS_YEAR * lengthOfMonth;
                accruedInterestPerMonth = Math.round(accruedInterestPerMonth * 100) / 100.0;    //округление до копейки

                System.out.println("Начисленно процентов в " + i + " году " + j + " месяце = " + accruedInterestPerMonth);
                accruedInterestTotal += accruedInterestPerMonth;
                monthsCount++;
            }
            i++;    //увеличим год на 1
        }
        System.out.println("Всего начислено процентов = " + accruedInterestTotal);
    }
}
