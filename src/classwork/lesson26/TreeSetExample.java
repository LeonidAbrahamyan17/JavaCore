package classwork.lesson26;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(new UserEmailComparator());
        User user1 = new User("poxos", "poxosyan4", "poxos3@mail.com", "poxos");
        User user2 = new User("aram", "poxosyan2", "poxos2@mail.com", "poxos");
        User user3 = new User("zaven", "poxosyan1", "poxos1@mail.com", "poxos");
        User user4 = new User("valod", "poxosyan3", "poxos4@mail.com", "poxos");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);

        for (User user : userSet) {
            System.out.println(user);
        }

    }
}