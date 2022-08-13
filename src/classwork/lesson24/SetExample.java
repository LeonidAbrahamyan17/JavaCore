package classwork.lesson24;

import homework.students.model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> hashSet = new TreeSet<>();

        hashSet.add("Արմեն");
        hashSet.add("Zaven");
        hashSet.add("Андрей");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}