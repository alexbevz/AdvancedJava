package ru.bevz.aj.stream;

import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
//        Stream<Integer> stream2 = Stream.concat(Stream.of(1), stream1);
//        stream2.forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 5, 4, 2);

//        stream5.distinct().forEach(System.out::println);

        stream5 = Stream.of(1, 2, 3, 5, 4, 2);

//        System.out.println(stream5.count());
//        stream5.close();
//        System.out.println(stream5.distinct().count());

        System.out.println(stream5.distinct().peek(System.out::println).count());
    }
}
