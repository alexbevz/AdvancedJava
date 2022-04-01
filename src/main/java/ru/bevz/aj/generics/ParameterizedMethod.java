package ru.bevz.aj.generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("333");
        list1.add("444");
        list1.add("566");
        String str = GenMethod.getSecondElement(list1);
        System.out.println(str);

        List<Integer> list2 = new ArrayList<>();
        list2.add(333);
        list2.add(444);
        list2.add(566);
        Integer integer = GenMethod.getSecondElement(list2);
        System.out.println(integer);
    }
}

class GenMethod {
    public static <T> T getSecondElement(List<T> al) {
        return al.get(1);
    }
}
