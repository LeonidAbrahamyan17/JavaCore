package classwork.lesson14;

public class Block {
    public int a;
    public static int b;

    //Constructor
    public Block() {
        System.out.println(a);
    }

    //Block
    {
        System.out.println("Non static Block works before constructor!");
        if (15 > 12) {
            a = 15;
        } else {
            a = 12;
        }
    }

    //Static Block
    static {
        System.out.println("From static Block! Static Block works before non static Block");
    }
}