package ru.bevz.aj.nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("Blue", 4);
        car.setEngine(car.new Engine(228));
        System.out.println(car);
        System.out.println(car.engine);

        car.setEngine(car.new Engine(228));
        Car.Engine engine2 = car.new Engine(23);

        Car.Engine engine3 = new Car("While", 1).new Engine(200);
    }
}