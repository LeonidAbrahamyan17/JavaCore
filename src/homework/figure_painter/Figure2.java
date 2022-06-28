package homework.figure_painter;

public class Figure2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

}
