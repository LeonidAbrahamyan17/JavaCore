package homework.lesson9.arrayUtil;

public class ArrayUtil {
    void number(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void oddnums(int array[]) {
        int oddnums = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddnums = array[i];
                System.out.print(oddnums + " ");

            }
        }
        System.out.println();
    }


    void evennums(int array[]) {
        int evennums = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                evennums = array[i];
                System.out.print(evennums + " ");

            }
        }

    }

    int countofeven(int array[]) {
        int countofeven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countofeven++;
            }
        }
        return countofeven;
    }


    int countofodd(int array[]) {
        int countofodd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countofodd++;
            }
        }
        return countofodd;
    }

    double sum(int array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }
    void sort(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                int j = 0;
                for (int num : array) {
                    if (num < array[j + 1]) {
                        array[j] = array[j + 1];
                        array[j + 1] = num;
                        j++;
                    } else j++;
                    if (j == array.length - 1) break;
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int k = 0;
                for (int num : array) {
                    if (num > array[k + 1]) {
                        array[k] = array[k + 1];
                        array[k + 1] = num;
                        k++;
                    } else k++;
                    if (k ==array.length - 1) break;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}