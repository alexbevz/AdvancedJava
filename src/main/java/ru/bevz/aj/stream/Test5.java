package ru.bevz.aj.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18, -1};

        int result = Arrays.stream(array)
                .filter(e -> e % 2 == 1)
                .filter(e -> e % 3 == 0)
                .map(e -> e / 3)
                .reduce(0, (a, e) -> a + e);

        System.out.println(result);
    }
}
