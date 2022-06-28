package classwork.lesson12;

public class OverLoadTest {

    void test() {
        System.out.println("I am test");
    }

    void test(int a) {
        System.out.println("I'm test " + a);
    }

    void test(String a) {
        System.out.println("I'm test " + a);
    }
}