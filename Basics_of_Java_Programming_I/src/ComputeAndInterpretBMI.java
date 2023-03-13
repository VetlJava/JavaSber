import java.util.Scanner;
/*
Вычисление индекса массы тела.
Индекс массы тела (BMI - Body Mass Index) является
показателем здоровья, исходя из роста и веса человека
 */

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100;
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите вес в киллограммах ");
        //получить вес в киллограммах
        weight = input.nextDouble();

        System.out.println("Введите рост в сантиметрах");
        //получить рост в сантиметрах
        height = input.nextDouble();
        //формула
        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);
        System.out.println("BMI равно: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Недостаточный вес");
        } else if (bmi < 25) {
            System.out.println("Норма");
        } else if (bmi < 30) {
            System.out.println("Избыточный вес");
        } else
            System.out.println("Ожирение");
    }
}
