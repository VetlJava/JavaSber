package cycle;

/**
 * В городе, чье население с каждым годом растет на 10%,
 * живет 9 870 человек. Напишите программу, которая отображает
 * ежегодную численность населения и определяет, через сколько
 * лет (count_years) она будет превышать 30 000 человек.
 */
public class Population {
    public static void main(String[] args) {
        int count_years,    //сколько лет
            sumPeople,      //сумма численности
            i;
        int livesPeople = 9870; //живет людей

        count_years = 0;
        i = 30000;
        while (livesPeople < i) {
            sumPeople = (int) (livesPeople * 0.1); //45
            livesPeople += sumPeople;
            ++count_years;
            System.out.println(count_years + " год, численность: " + livesPeople );
        }
        System.out.println("лет: " + count_years + ", численность: " + livesPeople);
    }
}
