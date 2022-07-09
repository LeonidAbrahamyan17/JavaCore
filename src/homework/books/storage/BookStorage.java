package homework.books.storage;

import homework.books.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;
    }


    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
        System.out.println();
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = books[i];
        }
        books = temp;
    }

    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(authorName)) {
                System.out.println(books[i]);
            }
        }
    }

    public void printBooksByGenre(String genre){
        for (int i = 0; i < size; i++) {
            if (genre.equals(books[i].getGenre())){
                System.out.println(books[i]);
            }
        }
    }

    public void PrintBooksByPriceRange(double lowestPrice, double highestPrice){
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= lowestPrice && books[i].getPrice() <= highestPrice){
                System.out.println(books[i]);
            }
        }
    }
}