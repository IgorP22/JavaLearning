package Homework.Lesson09;

/*
Урок 9 Разновидности переменных и пределы их видимости.

работа компилятором
по идее программа выдаст ошибку и не выполнится, т.к. нельзя создавать переменные с одинаковым именем
и модификатор дотупа тут не влияет ни на что.

(Верно)
 */

public class Test1 {
    int a = 1;
    //static int a = 2;

    void abc (int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main (String [] args) {
        Test1 t = new Test1();
        t.abc (3);
    }

}
