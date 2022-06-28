package homework.arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("c-փոփոխականից մեր մասիվի մեջ: " + count);


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };

        System.out.println("մեջտեղի 2 սինվոլները: " + (chars2[chars2.length / 2 - 1] + " " + chars2[chars2.length / 2]));


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };

        System.out.println("տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false: " + (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y'));


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        boolean contain = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                contain = true;
            }
        }
        System.out.println("տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ: " + contain);


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };

        System.out.print("տպել մասիվի այն սինվոլները որոնք պռաբել չեն: ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}