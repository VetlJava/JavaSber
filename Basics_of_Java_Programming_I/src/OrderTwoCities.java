import java.util.Scanner;

public class OrderTwoCities {
    /**
    Города в алфавитном порядке
     */
    public static void main(String[] args) {
        String city1, city2;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя первого города: ");
        city1 = input.nextLine();
        System.out.println("Введите имя вторго города: ");
        city2 = input.nextLine();

        if (city1.compareTo(city2) < 0 ) {
            System.out.println("Именя городов по алфавиту: \n" + city1 + "\n" + city2);
        } else System.out.println("Именя городов по алфавиту: \n" + city2 + "\n" + city1);
    }
}
