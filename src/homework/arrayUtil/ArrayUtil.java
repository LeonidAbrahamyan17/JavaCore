package homework.arrayUtil;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 0, 3, 6, 90, 8, 9, -3, 10};

        System.out.println("մասիվի բոլոր էլեմենտները: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = numbers[0];

        for (int j : numbers) {
            if (j > max)    
                max = j;
        }

        System.out.println("մասիվի ամենամեծ թիվը: " + max);

        int min = numbers[0];

        for (int j : numbers) {
            if (j < min)
                min = j;
        }

        System.out.println("մասիվի ամենափոքրը թիվը: " + min);

        System.out.println("մասիվի բոլոր զույգ էլեմենտները:");

        for (int i : numbers) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("մասիվի բոլոր կենտ էլեմենտները:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                System.out.print(numbers[i] + " ");
        }

        int h = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                h++;
        }
        System.out.println();
        System.out.println("զույգերի քանակը: " + h);
        System.out.println("կենտերի քանակը: " + (numbers.length - h));

        int number = 0;
        for (int i : numbers) {
            number += i;
        }
        System.out.print("մասիվի բոլոր թվերի միջին թվաբանականը: " + number / numbers.length);
        System.out.println();

        int x = 0;
        for (int j : numbers) {
            x += j;
        }
        System.out.println("մասիվի էլեմենտների գումարը: " + x);
    }

}
