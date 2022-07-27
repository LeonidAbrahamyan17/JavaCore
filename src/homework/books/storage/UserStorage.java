package homework.books.storage;

import homework.books.model.User;

public class UserStorage {
    private static User[] users = new User[10];
    private static int  size = 0;

    public static void add(User author) {
        if (users.length == size) {
            extend();
        }
        users[size++] = author;
    }

    public static void printAllUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i].toString());
        }
    }

    public void printUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i].toString());
        }
        System.out.println();
    }

    private static void extend() {
        User[] temp = new User[users.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = users[i];
        }
        users = temp;
    }

    public boolean isEmpty(User[] array) {
        return (size == 0);
    }


    public void deleteUserByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
        } else {
            for (int i = index; i < size; i++) {
                users[i] = users[i + 1];
            }
            size--;
            System.out.println("User has been deleted!");
        }
    }

    public void add(int index, User author) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
            System.out.println();
        } else {
            for (int i = index; i < users.length - 1; i++) {
                users[i + 1] = users[i];
                users[index] = author;
            }
            System.out.println("User has been added");
        }
    }

    public int getSize() {
        return size;
    }

    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)){
                return users[i];
            }
        }
        return  null;
    }
}