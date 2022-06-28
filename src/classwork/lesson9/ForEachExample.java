package classwork.lesson9;

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 7, 2, 57, 8, 9, 2};
        int sum = 0;
        for(int n: numbers){
            sum += n;
        }
        System.out.println(sum);
    }
}