package homework.students;

import homework.students.model.Lesson;
import homework.students.command.Commands;
import homework.students.exception.LessonNotFoundException;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher", 7, 1234);
        Lesson mysql = new Lesson("mysql", "teacher mysql", 7, 1234);
        Lesson php = new Lesson("php", "teacher php", 7, 1234);
        lessonStorage.add(java);
        lessonStorage.add(mysql);
        lessonStorage.add(php);
        studentStorage.add(new Student("Poxos", "Poxosyan", 24, "098877665", "Gyumri", java));
        studentStorage.add(new Student("Petros", "Petrosyan", 22, "055443322", "Gyumri", mysql));
        studentStorage.add(new Student("Martiros", "Martirosyan", 31, "093132333", "Gyumri", php));
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count:" + studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");
            }

        }


    }

    private static void addLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        System.out.println("Please input lesson teacherName");
        String teacherName = scanner.nextLine();
        System.out.println("Please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created!");
    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong Index!!!");
            changeStudentLessonName();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("please choose lesson index");
                try {
                    int lessonIndex = Integer.parseInt(scanner.nextLine());
                    Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    student.setLesson(lesson);
                    System.out.println("lesson changed!");
                } catch (LessonNotFoundException | NumberFormatException e) {
                    System.out.println("Please input correct number or index!");
                    changeStudentLessonName();
                }

            }

        }
    }

    private static void printStudentsByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            lessonStorage.print();
            System.out.println("please choose lesson index");

            Lesson lesson = null;
            try {
                int lessonIndex = Integer.parseInt(scanner.nextLine());

                lesson = lessonStorage.getLessonByIndex(lessonIndex);
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();
                System.out.println("please input student's age");
                int age = Integer.parseInt(scanner.nextLine());

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Student created");
            } catch (LessonNotFoundException | NumberFormatException e) {
                System.out.println("Please choose correct number or index!!!");
                addStudent();
            }
        }


    }

}