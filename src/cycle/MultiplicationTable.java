package cycle;
/**
 * Таблица умножения
 */
public class MultiplicationTable {
    public static void main(String[] args) {
//        имя таблицы
        System.out.println("\t\t\tТАБЛИЦА УМНОЖЕНИЯ\n");
//        имена столбцов
        for (int j = 1; j <= 9; j++) {
            System.out.print("\t" + j);
        }
        System.out.println("\n\t_\t_\t_\t_\t_\t_\t_\t_\t_");
//        имя строк и произведение
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <=9 ; j++) {
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }
    }
}
