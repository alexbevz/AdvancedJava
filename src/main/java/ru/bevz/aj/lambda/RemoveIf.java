package ru.bevz.aj.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("Bruuuh");
        al.add("How are you?");
        al.add("Java");
        al.add("Cucumber");
        al.add("Kek");

        System.out.println(al);
        Predicate<String> ps = str -> str.length() < 7;
        al.removeIf(ps);
        System.out.println(al);

    }
}
