package ru.bevz.aj.nested_classes.static_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfEngine);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfEngine = 0;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfEngine++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(228);
        Car car = new Car("Blue", 4, engine);
        System.out.println(car);
    }
}