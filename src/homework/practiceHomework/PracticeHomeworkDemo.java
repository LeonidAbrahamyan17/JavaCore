package homework.practiceHomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.convert(10) + " seconds");
        System.out.println(practiceHomework.calcAge(3) + " days");
        System.out.println(practiceHomework.nextNumber(-1));
        System.out.println(practiceHomework.isSameNum(5, 7));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-5));
        System.out.println(practiceHomework.reverseBool(true));
        int[] array1 = {8, 2, 3, 46, 6};
        int[] array2 = {23, 58, 9, 0, 5, 68, 80};
        System.out.println(practiceHomework.maxLength(array1, array2));
    }
}