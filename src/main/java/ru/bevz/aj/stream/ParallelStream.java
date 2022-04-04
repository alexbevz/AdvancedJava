package ru.bevz.aj.stream;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    // 1 2 3 4 5 ... 1000000000

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        int n = 10000000;

        for (int i = 0; i < n; i++) {
            list.add(Math.random() * 1000000);
        }

        long start = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        System.out.println(list.parallelStream().min(Double::compareTo));
        long end = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        System.out.println(end - start);

        start = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        System.out.println(list.stream().min(Double::compareTo));
        end = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        System.out.println(end - start);
    }
}
