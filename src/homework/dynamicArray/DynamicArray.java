package homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;
    private int index;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean isEmpty(int[] array) {
        return (size == 0);
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        if (size != 0) {
            return array[index];
        } else return 0;
    }

    public int getFirstIndexByValue(int value) {

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        return (index);

    }

    public void set(int index, int value) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        array[index] = value;
    }

    public void delete(int index) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        for (int i = index; i < array.length - 1; i++) {
            array[i + 1] = array[i];
            array[index] = value;
        }


    }
}
