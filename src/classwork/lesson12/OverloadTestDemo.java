package classwork.lesson12;

public class OverloadTestDemo {
    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoadTest();
        overLoadTest.test();
        overLoadTest.test(4);
        overLoadTest.test("Poxos");
    }
}