package homework.fileUtil;


import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Input path");
        String path = scanner.nextLine();
        System.out.println("Input file name");
        String name = scanner.nextLine();
        File file = new File(path, name);
        System.out.println(file.exists());
//        if (path.contains(name)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Input path");
        String path = scanner.nextLine();
        System.out.println("Input keyword");
        String keyword = scanner.nextLine();
        findFile(path, keyword);
    }

    private static void findFile(String path, String keyword) {
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        findFile(file.getAbsolutePath(), keyword);
                    } else {
                        if (file.getName().endsWith(".txt")) {
                            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                                String line = "";
                                while ((line = br.readLine()) != null) {
                                    if (line.contains(keyword)) {
                                        System.out.println(file.getAbsolutePath());
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }


        } else {
            System.out.println("Please input correct directory path");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input file path");
        String filePath = scanner.nextLine();
        System.out.println("please input keyword for search");
        String keyword = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()
                && file.getName().endsWith(".txt")) {

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int lineCount = 1;
                while ((line = br.readLine()) != null) {
                    if (line.contains(keyword)) {
                        line = line.replaceAll(keyword, "\u001B[33m" + keyword + "\u001B[0m");
                        System.out.println(lineCount + "-> " + line);
                    }
                    lineCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input directory path");
        String directoryPath = scanner.nextLine();

        File file = new File(directoryPath);

        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            long size = 0;
            for (File file1 : files) {
                if (file1.isFile()) {
                    size += file1.length();
                }
            }
            System.out.println("Size of package: " + (size / (1024 * 1024)) + "mb");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Input path");
        String directoryPath = scanner.nextLine();
        System.out.println("Input file name");
        String fileName = scanner.nextLine();
        System.out.println("Input file content");
        String fileContent = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File newFile = new File(directory, fileName);
            if (!newFile.exists()) {
                try {
                    newFile.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                        bw.write(fileContent);
                        System.out.println("File is ready!");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Please input fileName that is not exists");
            }
        } else {
            System.out.println("Please input correct directory");
        }

    }

}
