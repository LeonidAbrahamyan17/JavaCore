package classwork.lesson13;

public class ArgsExample {

    public static void main(String[] args) {
        System.out.println("args.lenght = " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
