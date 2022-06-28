package classwork.lesson10;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(4, 5, 6);
        Box myBox2 = new Box(4, 5, 6);

        System.out.println(myBox.equalTo(myBox2));

    }
}