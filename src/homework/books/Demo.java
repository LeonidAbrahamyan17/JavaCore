package homework.books;

import homework.books.command.Commands;
import homework.books.storage.BookStorage;
import homework.books.model.Book;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.storage.AuthorStorage;

import java.util.Scanner;

public class Demo implements Commands {

    private final static BookStorage bookStorage = new BookStorage();
    private final static Scanner scanner = new Scanner(System.in);
    private final static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) throws AuthorNotFoundException {
        Author Balzak = new Author("оноре", "бальзак", "Balzak@gmail.com", "MALE");
        AuthorStorage.add(Balzak);
        Author Shildt = new Author("Herbert", "Shildt", "HerbertShildt@gmail.com", "MALE");
        AuthorStorage.add(Shildt);
        Author Nar_Dos = new Author("Նար-Դոս", "", "Nar-Dos@gmaol.com", "MALE");
        AuthorStorage.add(Nar_Dos);
        Author Uayld = new Author("Oskar", "Uayld", "UayldOskar@gmail.com", "MALE");
        AuthorStorage.add(Uayld);

        bookStorage.add(new Book("Отец Горио", Balzak, 3500, 2, "classical"));
        bookStorage.add(new Book("Java", Shildt, 4000, 1, "educational"));
        bookStorage.add(new Book("Ես և Նա", Nar_Dos, 1500, 1, "classical"));
        bookStorage.add(new Book("Դորիան Գրեյի դիմանկարը", Uayld, 2500, 3, "detective"));

        String login = "Admin";
        int password = 123456;
        boolean runnable = false;

        while (!runnable) {
            System.out.println("Input your login");
            String Login = scanner.nextLine().trim();
            System.out.println("Input password");
            try {
                int Password = Integer.parseInt(scanner.nextLine().trim());
                runnable = (login.equals(Login) && password == Password);
            } catch (IllegalArgumentException e) {
                System.err.println("The password must be only numbers!!!");
            }
            if (!runnable) {
                System.err.println("Wrong username or password!!!");
                System.out.println("__________________________");

            }
        }
        while (runnable){
            printCommands();
            try {
                int command = Integer.parseInt(scanner.nextLine().trim());
                int index;
                switch (command){
                    case EXIT:
                        runnable = false;
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
                        printBooksByGenre();
                        break;
                    case PRINT_BOOKS_BY_PRICE_RANGE:
                        PrintBooksByPriceRange();
                        break;
                    case ADD_AUTHOR:
                        addAuthor();
                        break;
                    case PRINT_ALL_AUTHORS:
                        authorStorage.printAuthors();
                        break;
                    case DELETE_AUTHOR_BY_INDEX:
                        authorStorage.printAuthors();
                        System.out.println("Input author's index");
                        index = Integer.parseInt(scanner.nextLine());
                        authorStorage.deleteAuthorByIndex(index);
                        break;
                    case PRINT_AUTHOR_BY_INDEX:
                        System.out.println("Input author's index");
                        try {
                            index = Integer.parseInt(scanner.nextLine());
                            System.out.println(authorStorage.getAuthorByIndex(index));
                        }catch (AuthorNotFoundException e){
                            System.out.println(e.getMessage());
                            System.out.println();
                        }catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.err.println("Command with index " + command +" does not exist!!!");
                        break;
                }
            }catch (IllegalArgumentException e){
                System.out.println("Input number");
            }
        }
    }

    private static void addAuthor(){
        System.out.println("Input author name");
        String name = scanner.nextLine();
        System.out.println("Input author surname");
        String surname = scanner.nextLine();
        System.out.println("Input authors email");
        String email = scanner.nextLine();
        System.out.println("Input author gender");
        String gender = scanner.nextLine();
        Author author = new Author(name, surname, email, gender);
        AuthorStorage.add(author);
        System.out.println("The Author has been created!");
    }

    private static void PrintBooksByPriceRange(){
        try {
            System.out.println("Input the lowest price");
            double lowestPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Input the highest price");
            double highestPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.PrintBooksByPriceRange(lowestPrice, highestPrice);
        }catch (IllegalArgumentException e) {
            System.out.println("Input numbers only!!!");
        }
    }

    private static void printBooksByGenre() {
        System.out.println("Input book genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre.trim());
    }

    private static void printBooksByAuthorName() {
        System.out.println("Input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName.trim());
    }

    private static void addBook() throws AuthorNotFoundException{
        try {
            System.out.println("Input book title");
            String title = scanner.nextLine();
            System.out.println("Input author index");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Input book price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Input book count");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println("Input book genre");
            String genre = scanner.nextLine();
            Book book = new Book(title, authorStorage.getAuthorByIndex(index), price, count, genre);
            bookStorage.add(book);
            System.out.println("Book saved!");
        }catch (IllegalArgumentException e){
            System.out.println("Input numbers only!!!");
        }
    }

    private static void printCommands(){
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("please input " + ADD_AUTHOR + " for add new author");
        System.out.println("please input " + PRINT_ALL_AUTHORS + " for print all authors");
        System.out.println("please input " + DELETE_AUTHOR_BY_INDEX + "for delete author");
        System.out.println("please input " + PRINT_AUTHOR_BY_INDEX + " for print author by index");
    }

}