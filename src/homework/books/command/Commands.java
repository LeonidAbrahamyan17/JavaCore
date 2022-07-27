package homework.books.command;

public interface Commands {
    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOK_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHORS = 7;
    int DELETE_AUTHOR_BY_INDEX = 8;
    int PRINT_AUTHOR_BY_INDEX = 9;
    int PRINT_ALL_USERS = 10;
    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printUserCommands() {
        System.out.println("Input " + LOGOUT + " to logout");
        System.out.println("Input " + PRINT_ALL_BOOKS + " to print all books");
        System.out.println("Input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to print author's all books");
        System.out.println("Input " + PRINT_BOOK_BY_GENRE + " to print books with the same genre");
        System.out.println("Input " + PRINT_BOOKS_BY_PRICE_RANGE + " to sort the books by their price");
        System.out.println("Input " + PRINT_ALL_AUTHORS + " to print all Authors");
        System.out.println("Input " + PRINT_AUTHOR_BY_INDEX + " to print an Author by index");
    }

    static void printAdminCommands() {
        System.out.println("Input " + LOGOUT + " to logout");
        System.out.println("Input " + ADD_BOOK + " to add a book");
        System.out.println("Input " + PRINT_ALL_BOOKS + " to print all books");
        System.out.println("Input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to print author's all books");
        System.out.println("Input " + PRINT_BOOK_BY_GENRE + " to print books with the same genre");
        System.out.println("Input " + PRINT_BOOKS_BY_PRICE_RANGE + " to sort the books by their price");
        System.out.println("Input " + ADD_AUTHOR + " to add new Author");
        System.out.println("Input " + PRINT_ALL_AUTHORS + " to print all Authors");
        System.out.println("Input " + DELETE_AUTHOR_BY_INDEX + " to delete author");
        System.out.println("Input " + PRINT_AUTHOR_BY_INDEX + " to print an Author by index");
        System.out.println("Input " + PRINT_ALL_USERS + " to print all users");

    }

    static void printLoginCommands() {
        System.out.println("Input " + EXIT + " to exit the program");
        System.out.println("Input " + LOGIN + " to login");
        System.out.println("Input " + REGISTER + " to register");
    }
}