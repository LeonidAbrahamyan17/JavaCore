package classwork.lesson26;


import java.util.ArrayList;
import java.util.List;

public class SortListExample {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user1 = new User("poxos", "poxosyan", "poxos@mail.com", "poxos");
        User user2 = new User("aram", "poxosyan", "poxos@mail.com", "poxos");
        User user3 = new User("zaven", "poxosyan", "poxos@mail.com", "poxos");
        User user4 = new User("valod", "poxosyan", "poxos@mail.com", "poxos");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println("Before sort");
        for (User user : userList) {
            System.out.println(user);
        }
        userList.sort(new UserEmailComparator());
        System.out.println("After sort");
        for (User user : userList) {
            System.out.println(user);
        }
    }

}