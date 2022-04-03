package ru.bevz.aj.nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(10, 3);
    }
}

class Math {
    private int a = 10;
    public void getResult(int divisible, int divider) {
//        final int divisible = 21;
//        int divisible = 21;
        class Division {
//            private int divisible;
//            private int divider;
            private int a = 11;

//            void abc() {
//                divisible = 20;
//            }

//            public int getDivisible() {
//                return divisible;
//            }
//
//            public void setDivisible(int divisible) {
//                this.divisible = divisible;
//            }

//            public int getDivider() {
//                return divider;
//            }
//
//            public void setDivider(int divider) {
//                this.divider = divider;
//            }

            public double getQuotient() {
                return (double) divisible / divider;
            }

            public double getRemainder() {
                return divisible % divider;
            }

            public int getIntQuotient() {
                return divisible / divider;
            }

            public int getA() {
                return a;
            }
        }
        Division division = new Division();
//        division.setDivisible(10);
//        division.setDivider(3);
//        System.out.println(division.getDivisible());
        System.out.println(divisible);
        System.out.println(divider);
        System.out.println(division.getIntQuotient());
        System.out.println(division.getRemainder());
        System.out.println(division.getQuotient());
        System.out.println(division.getA( ));
    }
}
