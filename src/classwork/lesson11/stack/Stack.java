package classwork.lesson11.stack;

public class Stack {

    int[] array = new int[10];
    int index;

    Stack() {
        index = -1;
    }

    void push(int value) {
        if (index == 9) {
            System.err.println("Stack is full");
        } else array[++index] = value;
    }

    int pop() {
        if (index < 0) {
            System.err.println("Stack is empty");
            return 0;
        } else return array[index--];
    }
}