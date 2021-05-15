package Homework.Lesson11;

/*
Урок 11   Использование примитивных и ссылочных типов данных при вызове метода.
 */

public class Car {
    String color;
    String engine;
    public int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}


class CarTest {
    public static void ChangeDoorsNumbers(Car c1, int d) {
        c1.doors = d;

    }


    public static void ChangeCollorsPosition(Car c1, Car c2) {

        String c = c1.color;
        c1.color = c2.color;
        c2.color = c;


    }


    public static void main(String[] args) {
        Car car1 = new Car("Blue", "V6", 2);
        Car car2 = new Car("Red", "V4", 4);
        System.out.println(car1.color);
        System.out.println(car2.color);

        ChangeCollorsPosition(car1, car2);

        System.out.println(car1.color);
        System.out.println(car2.color);

        System.out.println(car2.doors);
        ChangeDoorsNumbers(car2, 5);
        System.out.println(car2.doors);


    }

}






