package ru.bevz.aj.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("bruuh");
        Info<Integer> info2 = new Info<>(228);
        System.out.println(info1);
        System.out.println(info2);
        Integer s1 = info2.getValue();
    }
}

class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
