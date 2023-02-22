import java.util.Scanner;

public class CircleL {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        double L, radius;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        L = 2 * PI * radius;
        System.out.println("Длинна окружности равна: " + L + ".");
    }
}
