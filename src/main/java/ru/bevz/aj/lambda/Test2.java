package ru.bevz.aj.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def((String s) -> s.length());
    }
}

interface I {
    int abc (String s);
}
