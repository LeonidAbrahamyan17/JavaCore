package classwork.lesson20;

import java.util.Locale;

public class EnumTest {

    public static void main(String[] args) {
        String genderStr = "female";
        try {
            Gender gender = Gender.valueOf(genderStr.toUpperCase());

            System.out.println(gender);
        }catch (IllegalArgumentException e){
            System.out.println("please input correct gender");
        }


    }

}
