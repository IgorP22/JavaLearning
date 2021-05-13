package Homework.Lesson9;

/*
Урок 9 Разновидности переменных и пределы их видимости.

работа компилятором
результат работы программы:
5
2

(Верно)
 */

public class Test2 {
    int a=1;
    static int b = 2;

    static void abc (final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main (String [] args) {
        abc(5);
    }

}
