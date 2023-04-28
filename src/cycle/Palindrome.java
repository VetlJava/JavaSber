package cycle;
/**
 * Палиндром
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        int low, high;  //конец и начало строки
        boolean isPalindrome;

        Scanner input = new Scanner(System.in);
        System.out.println("Ведите строку без пробелов: ");
        s = input.nextLine();

        low = 0;
        high = s.length() - 1;

        isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println(s + " является палиндромом");
        else
            System.out.println(s + " не является палиндромом");
    }
}
