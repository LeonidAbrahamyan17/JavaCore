package classwork.lesson22;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileExample {

    static String filePath = "C:\\Users\\LEONID\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\testFolder\\hello3.txt";
    static String newFilePath = "C:\\Users\\LEONID\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
        Date date = new Date(myFile.lastModified());
        System.out.println(date);


//        String os = System.getProperty("os.name").toLowerCase();
//        System.out.println(os);
//        File[] files = myFile.listFiles();
//        for (File file : files) {
//            if (file.getName().endsWith(".txt")) {
//                System.out.println(file.getName());
//            }
//        }

//        System.out.println(myFile.isDirectory());
//        System.out.println("Users" + File.separator + "karen" + File.separator + "");
//        boolean b = myFile.createNewFile();
//        System.out.println(b);
//        boolean b = myFile.renameTo(new File(newFilePath));
//        System.out.println(b);
//        System.out.println(myFile.lastModified());

//        System.out.println(myFile.exists());


//        if (!myFile.exists()) {
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//        System.out.println("isFile: " + myFile.isFile());
//        System.out.println("isDirectory: " + myFile.isDirectory());
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                if(file.isDirectory())
//                System.out.println(file.getName());
//            }
//        }


    }
}