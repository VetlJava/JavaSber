import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius, area;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");

        radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Некорректные входные данные.");
        } else {
          area = PI * radius * radius;
            System.out.println("Площадь для круга с радиусом " + radius +
                    " равна: " + area);
        }
    }
}
