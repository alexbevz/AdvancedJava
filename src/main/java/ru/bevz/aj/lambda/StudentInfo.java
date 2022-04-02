package ru.bevz.aj.lambda;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> al,StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 5, 8.3);
        Student st2 = new Student("Volya", 'm', 20, 2, 6.3);
        Student st3 = new Student("Maria", 'f', 18, 4, 4.2);
        Student st4 = new Student("Kolya", 'm', 19, 1, 6.4);
        Student st5 = new Student("Olya", 'f', 21, 3, 7.3);
        Student st6 = new Student("Alex", 'm', 23, 2, 9.9);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        StudentInfo info = new StudentInfo();

        info.testStudents(students, s -> s.getAvgGrade() > 8.0);
        printDash();
        info.testStudents(students, s -> s.getAge() < 20);
        printDash();
        info.testStudents(students, s -> s.getAge() > 20 && s.getAvgGrade() < 8.5 && s.getSex() == 'm');

    }

    static void printDash() {
        System.out.println("------------------------------------");
    }
}

interface StudentChecks {
    boolean check(Student s);
}
