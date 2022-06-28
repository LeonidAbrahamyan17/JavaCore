package homework.students;

import java.util.Scanner;

public class StudentStorage {
    private static Scanner scanner = new Scanner(System.in);

    private Student[] array = new Student[10];
    private int size = -1;


    public void add(Student student) {
        if (size == array.length) {
            increaseArray();
        }
        array[++size] = student;
    }


    public void print() {
        for (int i = 0; i < size + 1; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }


    private void increaseArray() {
        if (size == array.length) {
            Student[] temp = new Student[array.length + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void printStudentByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size+1;
    }

    public void changeLesson(int indexName) {
        array[indexName].setLesson(scanner.nextLine());
        System.out.println(array[indexName]);

    }
}
