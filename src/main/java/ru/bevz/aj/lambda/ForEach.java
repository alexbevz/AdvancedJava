package ru.bevz.aj.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String > list = List.of("Hello!", "how are you?", "Normal.", "Bye!");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(i);
        }

        System.out.println(integerList);

        integerList.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });
    }
}
