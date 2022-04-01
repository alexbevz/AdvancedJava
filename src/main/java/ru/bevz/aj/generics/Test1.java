package ru.bevz.aj.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("bye");
        list.add("good morning");
        list.add("bruuuh");

        for (String o : list) {
            System.out.println(o + " length " + o.length());
        }
    }
}

class Car {

}