package homework.books;

import homework.books.command.Commands;
import homework.books.model.Role;
import homework.books.model.User;
import homework.books.storage.BookStorage;
import homework.books.model.Book;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.storage.AuthorStorage;
import homework.books.storage.UserStorage;

import java.util.Locale;
import java.util.Scanner;

public class Demo implements Commands {

    private final static BookStorage bookStorage = new BookStorage();
    private final static Scanner scanner = new Scanner(System.in);
    private final static AuthorStorage authorStorage = new AuthorStorage();
    private final static UserStorage userStorage = new UserStorage();
    private static User registeredUser = null;
    static boolean runnable = true;

    public static void main(String[] args) throws AuthorNotFoundException {

        initData();
        while (runnable) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    runnable = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        login();
        while (runnable) {
            Commands.printUserCommands();
            try {
                int command = Integer.parseInt(scanner.nextLine().trim());
                int index;
                switch (command) {
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
                    case PRINT_BOOK_BY_GENRE:
                        printBookByGenre();
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
                        System.out.println("Input Author's Index");
                        index = Integer.parseInt(scanner.nextLine());
                        authorStorage.deleteAuthorByIndex(index);
                        break;
                    case PRINT_AUTHOR_BY_INDEX:
                        System.out.println("Input Author's index");
                        try {
                            index = Integer.parseInt(scanner.nextLine());
                            System.out.println(authorStorage.getAuthorByIndex(index));
                        } catch (AuthorNotFoundException e) {
                            System.out.println(e.getMessage());
                            System.out.println();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Can't do this function " + e.getMessage());
                        }
                        break;
                    default:
                        System.err.println("Command with index " + command + " does not exist!");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Input Number!");
            }
        }
    }

    private static void register() {
        System.out.println("Input your name, surname, email and passwords with commas");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Incorrect data");
        }
        if (userStorage.getUserByEmail(userData[2]) == null) {
            User user = new User();
            user.setName(userData[0].trim());
            user.setSurname(userData[1].trim());
            user.setEmail(userData[2].trim());
            user.setPassword(userData[3].trim());
            user.setRole(Role.USER);
            System.out.println("User has been created");
            UserStorage.add(user);
        } else {
            System.out.println("User with email " + userData[2] + " already exists!");
        }
    }

    private static void initData() {

        Author Balzac = new Author("Honore", "de Balzac", "Balzac@gmail.com", "MALE", registeredUser);
        AuthorStorage.add(Balzac);
        Author Shield = new Author("Herbert", "Shield", "HerbertShield@gmail.com", "MALE", registeredUser);
        AuthorStorage.add(Shield);
        Author Charles = new Author("Charles", "Charles Perrault", "Perrault@gmail.com", "MALE", registeredUser);
        AuthorStorage.add(Charles);
        Author Wilde = new Author("Oscar", "Wilde", "OscarWilde@gmail.com", "MALE", registeredUser);
        AuthorStorage.add(Wilde);

        bookStorage.add(new Book("Father Goriot", Balzac, 3500, 2, "classical"));
        bookStorage.add(new Book("Java", Shield, 5000, 7, "technical"));
        bookStorage.add(new Book("Little Thumb", Charles, 1500, 1, "fairy tale"));
        bookStorage.add(new Book("The Picture of Dorian Gray", Wilde, 2000, 3, "fiction & literature"));

        User admin = new User("Admin", "Adminyan", "admin@gmail.com", "AdminAdmin", Role.ADMIN);
        UserStorage.add(admin);
        User user = new User("User", "Useryan", "user@gmail.com", "UserUser", Role.USER);
        UserStorage.add(user);

    }

    private static void addAuthor() {
        System.out.println("Input Author's name");
        String name = scanner.nextLine();
        System.out.println("Input Author's surname");
        String surname = scanner.nextLine();
        System.out.println("Input Author's email");
        String email = scanner.nextLine();
        System.out.println("Input Author's gender");
        String gender = scanner.nextLine().toUpperCase(Locale.ROOT);
        Author author = new Author(name, surname, email, gender, registeredUser);
        AuthorStorage.add(author);
        System.out.println("The Author has been created");
    }

    private static void PrintBooksByPriceRange() {
        try {
            System.out.println("Input the lowest price");
            double lowestPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Input the highest price");
            double highestPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.PrintBooksByPriceRange(lowestPrice, highestPrice);
        } catch (IllegalArgumentException e) {
            System.err.println("Input numbers only!");
        }
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

    private static void addBook() throws AuthorNotFoundException {
        try {
            System.out.println("Input Book's Title");
            String title = scanner.nextLine();
            System.out.println("Input Book's Author's Index");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Input Book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Input Book's count");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println("Input Book's genre");
            String genre = scanner.nextLine();
            Book book = new Book(title, authorStorage.getAuthorByIndex(index), price, count, genre);
            bookStorage.add(book);
            System.out.println("The Book has been saved successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Input numbers only");
        }
    }

    static void login() throws AuthorNotFoundException {
        System.out.println("Input your email and password with comma");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with this email " + emailPassword[0] + " does not exist");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                registeredUser = user;
                if (user.getRole().equals(Role.ADMIN)) {
                    loginAdmin();
                } else if (user.getRole().equals(Role.USER)) {
                    loginUser();
                }
            }
        }
    }

    private static void loginUser() throws AuthorNotFoundException {
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    run = false;
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printAllBooks();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("Input the lowest price");
                    double lowest = scanner.nextDouble();
                    double highest = scanner.nextDouble();
                    bookStorage.PrintBooksByPriceRange(lowest, highest);
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.printAuthors();
                    break;
                case PRINT_AUTHOR_BY_INDEX:
                    authorStorage.printAuthors();
                    System.out.println("Input author's index");
                    int authorIndex = 0;
                    try {
                        authorIndex = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Input numbers only!");
                    }
                    authorStorage.getAuthorByIndex(authorIndex);
                    break;
            }
        }
    }

    private static void loginAdmin() throws AuthorNotFoundException {
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    run = false;
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
                case PRINT_BOOK_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("Input the lowest price");
                    double lowest = scanner.nextDouble();
                    double highest = scanner.nextDouble();
                    bookStorage.PrintBooksByPriceRange(lowest, highest);
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.printAuthors();
                    break;
                case DELETE_AUTHOR_BY_INDEX:
                    authorStorage.printAuthors();
                    System.out.println("Choose author's index");
                    int index = 0;
                    try {
                        index = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Input numbers only!");
                    }
                    authorStorage.deleteAuthorByIndex(index);
                    break;
                case PRINT_AUTHOR_BY_INDEX:
                    authorStorage.printAuthors();
                    System.out.println("Input author's index");
                    int authorIndex = 0;
                    try {
                        authorIndex = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Input numbers only!");
                    }
                    authorStorage.getAuthorByIndex(authorIndex);
                    break;
                case PRINT_ALL_USERS:
                    printAllUsers();
            }
        }
    }

    public static void printAllUsers() {
        userStorage.printUsers();
    }
}