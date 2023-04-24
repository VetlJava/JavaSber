import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру по шкале Цельсия: ");

        celsius = input.nextDouble();
        fahrenheit = 9.0 / 5 * celsius + 32;

        System.out.println(celsius + " по шкале Цельсия равно " + fahrenheit + " градусов по Фаренгейту");
    }
}
