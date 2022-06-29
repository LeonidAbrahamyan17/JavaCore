package homework.books;

import java.util.Scanner;

public class Demo implements Commands {

    private final static BookStorage bookStorage = new BookStorage();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        bookStorage.add(new Book("Հայր Գորիո", "Бальзак", 3500, 2, "classical"));
        bookStorage.add(new Book("Java", "Герберт Шилдт", 4000, 1, "educational"));
        bookStorage.add(new Book("Ես և Նա", "Նար-Դոս", 1500, 1, "classical"));
        bookStorage.add(new Book("Դորիան Գրեյի դիմանկարը", "Oskar Uayld", 2500, 3, "detective"));

        boolean runAble = true;
        while (runAble) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    runAble = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printAllBooks();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    PrintBooksByPriceRange();
            }
        }
    }

    private static void PrintBooksByPriceRange() {
        System.out.println("Input the lowest price");
        double lowestPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the highest price");
        double highestPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.PrintBooksByPriceRange(lowestPrice, highestPrice);
    }

    private static void printBookByGenre() {
        System.out.println("Input the Genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre.trim());
    }

    private static void printBooksByAuthorName() {
        System.out.println("Input Author's Name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName.trim());
    }


    private static void addBook() {
        System.out.println("Input Book's Title");
        String title = scanner.nextLine();
        System.out.println("Input Book's Author");
        String authorName = scanner.nextLine();
        System.out.println("Input Book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Book's count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Book's genre");
        String genre = scanner.nextLine();
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("The Book saved !");
    }
}