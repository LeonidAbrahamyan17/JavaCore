package classwork.lesson8;

public class Example {

    public static void main(String[] args) {
        int x = 200;
        int y = 14;
        int z = x > y ? x : y;
        if (x > y) {
            z = x;

        } else {
            z = y;
        }
        System.out.println("z = " + z);
    }

}
