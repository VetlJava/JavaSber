package cycle;
/**
 * Запрос строки и отображение ее в обратном порядке
 */

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        s = input.nextLine();

        String reversString = new StringBuffer(s).reverse().toString();
        System.out.println("Обратная строка " + s + " равна: " + reversString);
    }
}
