package classwork.lesson23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateDemo {

    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("hy"));

    public static void main(String[] args) {
        System.out.println("Please input date by dd/MM/yyyy format");
        String dateStr = scanner.nextLine();

//        String format = sdf.format(now);
        Date parseDate = null;
        try {
            parseDate = sdf.parse(dateStr);
            System.out.println(parseDate);
        } catch (ParseException e) {
            System.out.println("Please input date by dd/MM/yyyy");
        }

    }

}
