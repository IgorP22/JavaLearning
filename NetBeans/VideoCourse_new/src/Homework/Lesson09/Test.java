package Homework.Lesson09;
/*
Урок 9 Разновидности переменных и пределы их видимости.

Д31 - создать 8 объектов и на конец метода main должно остаться тольо 2
 */

public class Test {
}

class ObjectCreation {
    public static void main (String [] args) {
        Test t1 = new Test ();
        Test t2 = new Test ();
        Test t3 = new Test ();
        Test t4 = new Test ();
        Test t5 = new Test ();
        Test t6 = new Test ();
        Test t7 = new Test ();
        Test t8 = new Test ();

        t8 = null;
        t3=t4=t5=t6=t7=t8;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);


    }
}
