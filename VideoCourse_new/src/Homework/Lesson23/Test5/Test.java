package Homework.Lesson23.Test5;

// Тест 5
// не запустится  x.bool недоступен

class X {
    String s1="privet";
}

class Y extends X{
    boolean bool = false;
}


public class Test {

    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1 + " " + x.bool);
    }
}
