package Homework.Lesson25;
/*
Урок 25 Полиморфизм. Оператор «instanceof».
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




public class Home25 {

    public static void check(Object s) {
        /*if (s instanceof Animal) {
            System.out.println("Объект "+((Animal) s).name+ "это Animal");
            ((Animal) s).eat();
            ((Animal) s).sleep();
            System.out.println();
        }
        if (s instanceof Fish) {
            System.out.println("Объект "+((Fish) s).name+ "это Fish");
            ((Fish) s).sleep();
            ((Fish) s).swim();
            System.out.println();
        }
        if (s instanceof Bird) {
            System.out.println("Объект "+((Bird) s).name+ "это Bird");
            ((Bird) s).fly();
            ((Bird) s).speak();
            ((Bird) s).eat();
            ((Bird) s).sleep();
            System.out.println();
        }
        if (s instanceof Mummal){
            System.out.println("Объект "+((Mummal) s).name+ "это Mummal");
            ((Mummal) s).run();
            ((Mummal) s).eat();
            ((Mummal) s).sleep();
            ((Mummal) s).speak();
            System.out.println();
        }*/
        if (s instanceof Lev) {
            System.out.println("Объект "+((Lev) s).name+ "это Lev");
            ((Lev) s).eat();
            ((Lev) s).run();
            ((Lev) s).sleep();
            ((Lev) s).speak();
            System.out.println();

        }
        if (s instanceof Mechenosec) {
            System.out.println("Объект "+((Mechenosec) s).name+ "это Mechenosec");
            ((Mechenosec) s).eat();
            ((Mechenosec) s).swim();
            ((Mechenosec) s).sleep();
            System.out.println();
        }
        if (s instanceof  Pingvin) {
            System.out.println("Объект "+((Pingvin) s).name+ "это Pingvin");
            ((Pingvin) s).eat();
            ((Pingvin) s).sleep();
            ((Pingvin) s).fly();
            ((Pingvin) s).speak();
            System.out.println();
        }/*
        if (s instanceof Speakable){
            System.out.println("Объект "+((Animal) s).name+ "это Speakable");
            ((Speakable) s).speak();
            ((Animal) s).sleep();
            ((Animal) s).eat();
            System.out.println();
        }*/
        System.out.println("---------------------");
    }


    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Mech 1 ");
        Animal a2 = new Lev("Lev 1" );
        Animal a3 = new Pingvin("Ping 1 ");
        Bird b1 = new Pingvin("Ping 2 ");
        Fish f1 = new Mechenosec("Mech 2 ");
        Mummal m1 = new Lev("Lev 2 ");
        Mechenosec me1 = new Mechenosec("Mech 3 ");
        Pingvin p1 = new Pingvin("Ping 3 ");
        Lev l1 = new Lev("Lev 3 ");
        Speakable sp1 = new Pingvin("Ping 4 ");
        Speakable sp2 = new Lev("Lev 4 ");






        Speakable [] s1 = new Speakable[] {sp1, sp2, l1, p1, m1, b1};
        Animal [] ar1 = new Animal[] {a1, a2, a3, b1, f1, m1, me1, p1, l1};

        // мой вариант не хуже, не нужно писать код дважды
        // топ Object применяется для унификации метода check
        // и там в целом проверяется принадлежность ко всем классам
        // что возможно и не нужно, закоментировал ненужные проверки.

        for (Object s: s1) {
            check(s);
        }

        for (Object s:ar1) {
            check(s);
        }

        // В ответе к д/з чуть по другому проверяется только принадлежность к финализированным классам
        /*

        for (Animal a:ar1) {
            if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            } else
            if (a instanceof Lev) {
                Lev p = (Lev) a;
                p.eat();
                p.sleep();
                p.speak();
                p.run();
            } else
            if (a instanceof Mechenosec) {
                Mechenosec p = (Mechenosec) a;
                p.eat();
                p.sleep();
                p.swim();
            }

            System.out.println("------------------");
        }

        for (Speakable a:s1) {
            if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            } else
            if (a instanceof Lev) {
                Lev p = (Lev) a;
                p.eat();
                p.sleep();
                p.speak();
                p.run();
            } else
            if (a instanceof Mechenosec) {
                Mechenosec p = (Mechenosec) a;
                p.eat();
                p.sleep();
                p.swim();
            }

            System.out.println("------------------");
        }*/







    }
}
