package ru.bevz.aj.nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Plusing implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Plusing s = new Plusing();
        System.out.println(s.doOperation(5, 3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
