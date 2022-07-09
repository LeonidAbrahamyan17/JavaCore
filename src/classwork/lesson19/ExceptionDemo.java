package classwork.lesson19;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            printWithoutWhiteSpace(null);
        } catch (NoWhiteSpaceException | NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("after method call");

    }

    static String printWithoutWhiteSpace(String value) throws NoWhiteSpaceException {
        if (value == null) {
            throw new NullPointerException("value can't be null");
        }
        if (value.equals("")) {
            throw new IllegalArgumentException("value can't be empty");
        }
        if (!value.contains(" ")) {
            throw new NoWhiteSpaceException();
        }
        return value.trim();
    }

}