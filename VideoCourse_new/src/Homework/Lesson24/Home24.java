package Homework.Lesson24;
/*
Урок 24 Абстрактные Дефолтные Статические методы в Интерфейсе.
 */

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name = name;
    }
    public void sleep () {
        System.out.println("Всегда интересно наблюдать, как спят рыбы.");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    public Bird (String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + "поет");
    }
}

abstract class Mummal extends Animal implements Speakable{
    public Mummal (String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    public default void speak() {
        System.out.println("Кто-то говорит");
    }
}

class Mechenosec extends Fish {
    public Mechenosec (String name) {
        super(name);
        this.name = name;
    }
    public void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }
    public void eat() {
        System.out.println("Меченосец не хищная рыба и она ест обычный рыбий корм");
    }
}

class Pingvin extends Bird {
    public Pingvin (String name) {
        super(name);
        this.name = name;
    }
    public void eat () {
        System.out.println("Пингвин любит есть рыбу!");
    }
    public void sleep () {
        System.out.println("Пингвины спят прижавшись друг к другу.");
    }
    public void fly () {
        System.out.println("Пингвины не умеют летать");
    }
    public void speak () {
        System.out.println("Пингвыны не умеют петь как соловей");
    }
}

class Lev extends Mummal {
    public Lev (String name) {
        super(name);
        this.name = name;
    }
    public void eat () {
        System.out.println("Лев любит мясо");
    }
    public void sleep () {
        System.out.println("Большую часть дня лев спит.");
    }
    public void run (){
        System.out.println("Лев - это не самая быстрая кошка");
    }
}


public class Home24 {
    public static void main(String[] args) {
        Mechenosec m1 =  new Mechenosec("Рыбка ");
        System.out.println(m1.name);
        m1.eat();
        m1.swim();
        m1.sleep();
        Speakable s1 = new Pingvin("Пинг ");
        s1.speak();
        Animal a1 = new Lev("Царь");
        System.out.println(a1.name);
        a1.eat();
        a1.sleep();
        Mummal mu1 = new Lev("Сынок ");
        System.out.println(mu1.name);
        mu1.eat();
        mu1.run();
        mu1.sleep();
        mu1.speak();
    }
}
