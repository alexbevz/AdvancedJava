package ru.bevz.aj.generics.game;

public class Test {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Bob", 13);
        Pupil pupil2 = new Pupil("Ivan", 14);

        Student student1 = new Student("Keks", 20);
        Student student2 = new Student("Borya", 21);

        Employee employee1 = new Employee("Bruuuh", 26);
        Employee employee2 = new Employee("Noise", 28);

        Team<Pupil> pupilTeam = new Team<>("MilkSuckers");
        pupilTeam.addPlayer(pupil1);
        pupilTeam.addPlayer(pupil2);

        Team<Student> studentTeam = new Team<>("BeerSuckers");
        studentTeam.addPlayer(student1);
        studentTeam.addPlayer(student2);

        Team<Employee> employeeTeam = new Team<>("Boomers");
        employeeTeam.addPlayer(employee1);
        employeeTeam.addPlayer(employee2);

        Team<String> anotherTeam = new Team<>("Bruuuh, It's a bug!");
    }
}
