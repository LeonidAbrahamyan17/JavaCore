package homework.practiceHomework;

public class PracticeHomework {

    long convert(int minutes) {
        if (minutes < 0) {
            System.out.println("value is negative");
            return 0;
        } else {
            System.out.print(minutes + " minutes = ");
            return minutes * 60;
        }
    }

    int calcAge(int years) {
        if (years < 0) {
            return 0;
        } else {
            System.out.print(years + " years = ");
            return years * 365;
        }
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else return false;
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            System.out.println("array1.lenght=array2.lenght");
            return 0;
        } else {
            if (array1.length > array2.length) {
                System.out.print("array1 length = ");
                return array1.length;
            } else {
                System.out.print("array2 length = ");
                return array2.length;
            }
        }
    }
}