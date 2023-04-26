package cycle;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1, number2, answer;

        Scanner input = new Scanner(System.in);

        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);

        System.out.println("Сколько будет " + number1 + " + " + number2 + " ?");
        answer = input.nextInt();
        while (number1 + number2 != answer) {
            System.out.println("Неправильный ответ. Поробуйте ещё раз." +
                    " Сколько будет " + number1 + " + " + number2 + " ?");
             answer = input.nextInt();
        }
        System.out.println("Правильный ответ!");
    }
}
