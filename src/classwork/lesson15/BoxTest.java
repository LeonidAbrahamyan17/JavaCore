package classwork.lesson15;

public class BoxTest {

    public static void main(String[] args) {
        Box myBox1 = new Box(3,4,5);
        Box myBox2 = new Box(3,4,5);
        Box myBox3 = myBox1;

        System.out.println(myBox1.equals(myBox3));
    }

}
