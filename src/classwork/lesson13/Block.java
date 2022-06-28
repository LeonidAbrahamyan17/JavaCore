package classwork.lesson13;

public class Block {

    public int a;
    public static int b;

    static {
        System.out.println("from static block");
    }

    public Block() {
        if (20 > 15) {
            a = 40;
        } else {
            a = 30;
        }
        System.out.println(a);
    }

}
