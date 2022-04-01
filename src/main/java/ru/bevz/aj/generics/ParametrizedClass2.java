package ru.bevz.aj.generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("bruuuh", 228);
        Pair<Integer, Double> pair2 = new Pair<>(228, 228.0);
        System.out.println(pair1);
        System.out.println(pair2);
        OtherPair<String> pair3 = new OtherPair<>("bruuuh", "cool");
        System.out.println(pair3 );
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public V abc(V val) {
        return val;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}