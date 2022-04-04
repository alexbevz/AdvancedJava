package ru.bevz.aj.stream;

import ru.bevz.aj.lambda.Student;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 5, 8.3);
        Student st2 = new Student("Volya", 'm', 20, 2, 6.3);
        Student st3 = new Student("Maria", 'f', 18, 4, 4.2);
        Student st4 = new Student("Kolya", 'm', 19, 1, 6.4);
        Student st5 = new Student("Olya", 'f', 21, 3, 7.3);
        Student st6 = new Student("Alex", 'm', 23, 2, 9.9);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Math");

        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st4);

        f2.addStudent(st4);
        f2.addStudent(st3);
        f2.addStudent(st5);
        f2.addStudent(st6);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .forEach(System.out::println);

    }
}

class Faculty {
    private String name;
    List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
