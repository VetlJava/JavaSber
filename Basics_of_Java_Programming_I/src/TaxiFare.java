import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        final double COST_PER_KILOMETR = 8.50;
        int distance;
        double startOdometr, finishOdometr, rez;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите начальные показания одометра, например: 13505 ");
        startOdometr = input.nextInt();

        System.out.println("Введите конечные показания одометра, например: 13810 ");
        finishOdometr = input.nextInt();
        distance = (int) (finishOdometr - startOdometr);
        rez = COST_PER_KILOMETR * distance;

        System.out.println("Вы проехали " + distance + "км. " + "Из расчета 8 руб. 50 коп. " +
                "за км, стоимость проезда равна " + rez + " руб.");

    }

    /*
    ЧЕТЧИК СТОИМОСТИ ПРОЕЗДА
Введите начальные показания одометра: 13505
Введите конечные показания одометра: 13810
Вы проехали 305 км. Из расчета 8 руб. 50 коп. за км,
стоимость проезда равна 2592 руб. 50 коп.
     */

}
