package classwork.lesson24;

import homework.students.model.Student;

import java.awt.print.Book;

public class StorageDemo {

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(7);
        Storage<Boolean> booleanStorage = new Storage<>();

        Storage<String> strStorage = new Storage<>();

        strStorage.add("9");
        String str = strStorage.getByIndex(0);


        Storage<Student> studentStorage = new Storage<>();

        studentStorage.add(new Student());

        Student student = studentStorage.getByIndex(0);


    }
}