package classwork.lesson20;

import java.util.Scanner;

public class LanguageTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Language lang = Language.RU;

        switch (lang){
            case HY:
                System.out.println("Բարև");
                break;
            case RU:
                System.out.println("Привет");
                break;
            case ENG:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Hola");
                break;
        }

        Language.CH.setCountry("China");
        System.out.println("please choose language from list");
        Language[] values = Language.values();
        for (Language value : values){
            System.out.println(value + ", ");
        }

        try {
            String langStr = scanner.nextLine();
            if (langStr != null){
                Language chooseLang = Language.valueOf(langStr.toUpperCase());
                System.out.println("chosen: " + chooseLang);
                System.out.println("country: " + chooseLang.getCountry());
                System.out.println("index: " + chooseLang.ordinal());
            }
        }catch (IllegalArgumentException e){
            System.out.println("please choose element from the list");
        }
    }
}
