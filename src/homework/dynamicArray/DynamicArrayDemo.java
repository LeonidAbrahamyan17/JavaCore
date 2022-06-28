package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(15, 2);
        dynamicArray.printArray();
        dynamicArray.delete(5);
        dynamicArray.printArray();
        dynamicArray.set(0, 100);
        dynamicArray.printArray();

    }
}