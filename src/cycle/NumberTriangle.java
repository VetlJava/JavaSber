package cycle;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" " + j);
            }
                System.out.println();
        }

        for (int i = 5; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
