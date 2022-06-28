package homework.arrayUtil;

public class ArraySort {
    public static void main(String[] args) {

        System.out.print("մասիվի բոլոր էլեմենտները դասավորած աճման կարգով: ");
        System.out.println();
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.print("մասիվի բոլոր էլեմենտները դասավորած նվազման կարգով:");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}