package homework.bracechecker;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    int last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + " but not opend at" + i);
                    } else if (last != '(') {
                        System.err.println("Error: closed" + c + " but opend" + (char) last + "at" + i);
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + " but not opend at" + i);
                    } else if (last != '{') {
                        System.err.println("Error: closed" + c + " but opend" + (char) last + "at" + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + " but not opend at" + i);
                    } else if (last != ']') {
                        System.err.println("Error: closed" + c + " but opend" + (char) last + "at" + i);
                    }
                    break;
            }
        }
    }
}
