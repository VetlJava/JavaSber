import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int x, i;

        Scanner input = new Scanner(System.in);
        System.out.println("Введи целое число");
        x = input.nextInt();

        System.out.print("Простые числа: ");
        for (i = 2; i <= x; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print("\t " + i);
            }
        }
    }
}
