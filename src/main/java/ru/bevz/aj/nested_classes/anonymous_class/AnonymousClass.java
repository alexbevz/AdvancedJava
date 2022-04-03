package ru.bevz.aj.nested_classes.anonymous_class;

public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {
        Math m = new Math() {
            int c = 10;
            void abc() {}
            @Override
            public int doOperation(int a, int b) {
                return a + b + new AnonymousClass().x;
            }

            @Override
            public void doProcedure() {

            }
        };
        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }

            @Override
            public void doProcedure() {

            }
        };
        System.out.println(m.doOperation(2, 3));
        System.out.println(m2.doOperation(2, 3));
    }
}

interface Math {
    int doOperation(int a, int b);
    void doProcedure();
}
