package ru.bevz.aj.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("how are you");
        list.add("OK");
        list.add("bye");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }

        Stream<Integer> integerStream = list.stream().map(element -> element.length());
        List<Integer> integerList = integerStream.collect(Collectors.toList());

        System.out.println(integerList);
    }
}
