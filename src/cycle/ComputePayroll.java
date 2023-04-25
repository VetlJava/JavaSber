package cycle;

import java.util.Scanner;

/**
 * Расчет зарплаты каждого сотрудника
 * Общая зп компании
 */
public class ComputePayroll {
    public static void main(String[] args) {
        int     number_emp, //кол-во сотрудников
                count_emp = 0;  //текущий сотрудник
        double  hours,      //отработанные часы
                rate,       //часовая ставка в руб.
                pay,        //зарплата текущего сотрудника в руб.
                total_pay = 0.0;  //общая зп компании

        Scanner input = new Scanner(System.in);

        System.out.print("Введите кол-во сотрудников: ");
        number_emp = input.nextInt();

        while (number_emp > count_emp) {

            System.out.print("Введите кол-во отработанных часов: ");
            hours = input.nextInt();

            System.out.print("Введите ставку текущего сотрудника: ");
            rate = input.nextInt();

            pay = hours * rate;    //зп сотрудника
            System.out.println("\tЗарплата сотрудника: " + (count_emp + 1) + " равна: " + pay + "руб.\n");

            total_pay += pay;    //общая зп компании
            ++count_emp;
        }
        System.out.println("Все сотрудники обработаны");
        System.out.println("Общая арплата компании равна: " + total_pay + "руб.");
    }
}
