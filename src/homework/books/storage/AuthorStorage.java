package homework.books.storage;

import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;

public class AuthorStorage {
    private static Author[] authors = new Author[10];
    private static int size = 0;

    public static void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    public void printAuthors() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i].toString());
        }
        System.out.println();
    }

    private static void extend() {

        Author[] temp = new Author[authors.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = authors[i];
        }
        authors = temp;
    }

    public boolean isEmpty(Author[] array) {
        return (size == 0);
    }

    public void deleteAuthorByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!!!");
        } else {
            for (int i = index; i < size; i++) {
                authors[i] = authors[i + 1];
            }
            size--;
            System.out.println("Author has been deleted!");
        }
    }

    public void add(int index, Author author) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!!!");
            System.out.println();
        } else {
            for (int i = index; i < authors.length - 1; i++) {
                authors[i + 1] = authors[i];
                authors[index] = author;
            }
            System.out.println("User has been added!");
        }
    }

    public int getSize() {
        return size;
    }

    public Author getAuthorByIndex(int index) throws AuthorNotFoundException {
        if (index < 0 || index > size) {
            throw new AuthorNotFoundException("There is no author with index " + index);
        } else {
            return authors[index];
        }
    }
}
