import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1, number2, answer;

        Scanner input = new Scanner(System.in);

        //генерация случайных целых чисел
        number1 = (int) (System.currentTimeMillis() % 10);
        number2 = (int) (System.currentTimeMillis() / 10 % 10);

        System.out.println("Сколько будет " + number1 + " + " + number2 + " ?");
        answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " это " +
                (number1 + number2 == answer));
    }
}
