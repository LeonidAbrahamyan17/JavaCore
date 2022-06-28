package classwork.lesson13;

public class A {
    public int a = 10;
    public static int t = 10;

    void meth() {
        B b = new B();
        System.out.println(b.b);
    }

    static class B {
        int b = 20;

        void meth() {
            System.out.println(t);
        }
    }
}