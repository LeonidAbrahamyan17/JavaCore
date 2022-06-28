package homework.arrayUtil;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', ' ', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int end = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                start = i;
                break;
            }

        }

        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] != ' ') {
                end = i;
                break;
            }
        }

        System.out.print("տպել result մասիվի բոլոր էլեմենտները: ");
        char[] result = new char[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = spaceArray[start];
            start++;
            System.out.print(result[i]);
        }
    }
}