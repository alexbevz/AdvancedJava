package ru.bevz.aj.generics.game;

public class Test {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Bob", 13);
        Pupil pupil2 = new Pupil("Ivan", 14);

        Pupil pupil3 = new Pupil("Sergo", 12);
        Pupil pupil4 = new Pupil("Inna", 10);

        Student student1 = new Student("Keks", 20);
        Student student2 = new Student("Borya", 21);

        Employee employee1 = new Employee("Bruuuh", 26);
        Employee employee2 = new Employee("Noise", 28);

        Team<Pupil> pupilTeam1 = new Team<>("MilkSuckers");
        pupilTeam1.addPlayer(pupil1);
        pupilTeam1.addPlayer(pupil2);

        Team<Pupil> pupilTeam2 = new Team<>("Oh, babies!");
        pupilTeam2.addPlayer(pupil1);
        pupilTeam2.addPlayer(pupil2);

        Team<Student> studentTeam = new Team<>("BeerSuckers");
        studentTeam.addPlayer(student1);
        studentTeam.addPlayer(student2);

        Team<Employee> employeeTeam = new Team<>("Boomers");
        employeeTeam.addPlayer(employee1);
        employeeTeam.addPlayer(employee2);

        pupilTeam1.playWith(pupilTeam2);
    }
}
