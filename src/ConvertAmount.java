import java.util.Scanner;

public class ConvertAmount {
    public static void main(String[] args) {
        double x1, x2, x3, rez;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите через Enter x1, x2, x3 ");
        x1 = input.nextDouble();
        x2 = input.nextDouble();
        x3 = input.nextDouble();

        rez = Math.cbrt(x1 * x2 * x3 );
        System.out.println(rez);
    }
}
