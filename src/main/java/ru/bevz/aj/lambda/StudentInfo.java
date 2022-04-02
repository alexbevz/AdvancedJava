package ru.bevz.aj.lambda;

import java.util.ArrayList;

public class StudentInfo {
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
        info.printStudentOverGrade(students, 8.0);
        printDash();
        info.printStudentsUnderAge(students, 20);
        printDash();
        info.printStudentMixCondition(students, 8.5, 20, 'm');

    }

    static void printDash() {
        System.out.println("------------------------------------");
    }

    void printStudentOverGrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.getAvgGrade() < grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.getAge() < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> al, double grade, int age, char sex) {
        for (Student s : al) {
            if (s.getAge() > age && s.getAvgGrade() < grade && s.getSex() == sex) {
                System.out.println(s);
            }
        }
    }
}
