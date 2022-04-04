package ru.bevz.aj.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(228);
        list.add(-123);
        list.add(5);
        list.add(2);
        list.add(3);

        Optional<Integer> optionalInteger = list.stream().reduce((accumulator, element) -> accumulator * element);
        int result = list.stream().reduce(1, (accumulator, element) -> accumulator * element);

        System.out.println(optionalInteger.isPresent() ? optionalInteger.get() : "Bruuuh");
        System.out.println(result);

        list = list.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
        System.out.println(list);
    }
}
