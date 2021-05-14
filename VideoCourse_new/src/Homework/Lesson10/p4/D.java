package Homework.Lesson10.p4;

/*
Урок 10 Понятия «import» и «import static». Использование комментариев.
 */

import Homework.Lesson10.p1.*;
import Homework.Lesson10.p1.p2.*;
import Homework.Lesson10.p1.p2.p3.*;
import Homework.Lesson10.p4.p5.*;
import static Homework.Lesson10.p1.p2.B.*;


public class D {

    public static void main(String[] args) {

        A a1 = new A();
        a1.TestA();
        System.out.println(a1.a);

        C c1 = new C();
        c1.TestC();
        System.out.println(c1.c);

        E e1 = new E();
        e1.TestE();
        System.out.println(e1.e);

        // вызов стандартным методом

        B b1 = new B();
        b1.TestB();
        System.out.println(b1.b);
        System.out.println(b1.any2);

        //вызов через import static (всех статичных методов и переменных из класса В
        System.out.println();
        System.out.println("Вызов после import static без создания объекта");
        TestB();
        System.out.println(b);
        //System.out.println(any2);










        //System.out.println(Homework.Lesson10.p1.p2.B);
        //TestB();

    }




}
