package classwork.lesson12;

public class StringTest {
    public static void main(String[] args) {
        String name = "Poxos Poxosyan";
        name = name.trim();
        System.out.println(name.toUpperCase());
        String ly = "asdsflybrbrdsh";
        System.out.println(ly.endsWith("dsh"));
        String subName = name.substring(6, 12);
        System.out.println(subName.toUpperCase());
        char[] chars = name.toCharArray();
        System.out.println(chars.length);


    }
}