package cycle;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        int n, i, sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        n = input.nextInt();

        i = 0;
        sum = 0;
        while (i < n) {
            i += 1;
            sum += i;
        }
        System.out.println("Сумма целых чисел от 1 до " + n + " равна: " + sum);
        if (((n * (n + 1)) / 2) == sum) {
            System.out.println("Это эквивалентно: ");
        } else
            System.out.println("Это не эквивалентно: ");
        System.out.println("(n * (n + 1)) / 2 для n, равного " + n);
    }
}
