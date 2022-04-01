package ru.bevz.aj.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("hello");

        List<? extends Number> list30 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(2.0);
        list1.add(2.3);
        list1.add(2.5);

        List<String> list2 = new ArrayList<>();
        list2.add("asda");
        list2.add("a213");
        list2.add("a23eda");

        showListInfo(list);
        showListInfo(list1);
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(2.0);
        ald.add(2.3);
        ald.add(2.5);
        System.out.println(summ(ald));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list contains the next elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> list) {
        double summ = 0;

        for (Number n : list) {
            summ += n.doubleValue();
        }

        return summ;
    }
}
