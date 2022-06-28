package classwork.lesson6;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {87, 55, 21, -7, 0};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        numbers[4] = 74;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}
