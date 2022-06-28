package homework.lesson9.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.number(numbers);
        System.out.println();
        System.out.println("max = " + arrayUtil.max(numbers));
        System.out.println("min = " + arrayUtil.min(numbers));
        arrayUtil.oddnums(numbers);
        arrayUtil.evennums(numbers);
        System.out.println();
        System.out.println("կենտ թվերի քանակ = " + arrayUtil.countofodd(numbers));
        System.out.println("զույգ թվերի քանակ = " + arrayUtil.countofeven(numbers));
        System.out.println("գումարը = " + arrayUtil.sum(numbers));
        System.out.println("միջին թվաբանական = " + (arrayUtil.sum(numbers) / numbers.length));
        arrayUtil.sort(numbers);

    }
}
