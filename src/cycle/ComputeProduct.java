package cycle;

import java.util.Scanner;

public class ComputeProduct {
    public static void main(String[] args) {
        int n, product;
        Scanner input = new Scanner(System.in);

        product = 1;
        while (product < 10_000) {
            System.out.print("Введите целое число: ");
            n = input.nextInt();
            product *= n;
        }
        System.out.println("Произведение введёных чисел: " + product);
    }
}
