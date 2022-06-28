package homework.students;

import java.util.Scanner;

public class StudentDemo implements Commands{

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage(); 
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input "+EXIT+" for exit");
            System.out.println("please input "+ADD_STUDENT+" for add student");
            System.out.println("please input "+PRINT_ALL_STUDENTS+" for print all student");
            System.out.println("please input "+DELETE_STUDENTS_BY_INDEX+" for delete student by index");
            System.out.println("please input "+PRINT_STUDENT_BY_LESSON+" for print student by lesson");
            System.out.println("please input "+PRINT_STUDENTS_COUNT+" for print students count");
            System.out.println("please choose "+CHANGE_STUDENTS_LESSON+" for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
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
                case DELETE_STUDENTS_BY_INDEX:
                    studentStorage.print();
                    System.out.println("please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.delete(index);
                    break;
                case 4:
                    System.out.println("please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentByLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("students count:");
                    System.out.println(studentStorage.getSize());
                    break;
                case 6:
                    studentStorage.print();
                    System.out.println("please choose student index");
                    int indexName = Integer.parseInt(scanner.nextLine());
                    studentStorage.changeLesson(indexName);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }


    }

    private static void addStudent() {
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson");
        String lesson = scanner.nextLine();


        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("student created");

    }
}