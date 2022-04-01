package ru.bevz.aj.generics.game;

public class Test {
    public static void main(String[] args) {
        Player pupil1 = new Pupil("Bob", 13);
        Player pupil2 = new Pupil("Ivan", 14);

        Player student1 = new Student("Keks", 20);
        Player student2 = new Student("Borya", 21);

        Player employee1 = new Employee("Bruuuh", 26);
        Player employee2 = new Employee("Noise", 28);

        Team pupilTeam = new Team("MilkSuckers");
        pupilTeam.addPlayer(pupil1);
        pupilTeam.addPlayer(pupil2);

    }
}
