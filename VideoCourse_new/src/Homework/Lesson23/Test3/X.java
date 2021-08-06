//package Homework.Lesson23.Test3;
//
//// Тест 3
//
//// запуск Х выведет:
//// Y
//// true
////
//// Ошибка:
//// также при запуске конструктора Y, сначала
//// вызывается родительский конструктор, т.е. сначала выведется Х
//// почему false вместо true не ясноб разобраться на следующем уроке
//// видимо это compile-time binding ..... а я посчитал наоборот
//
//public class X {
//    public X ()  {
//        System.out.println("X");
//    }
//
//    public X (int i) {
//        System.out.println("X"+i);
//    }
//
//    private boolean abc () {
//        return false;
//    }
//
//    public static void main(String[] args) {
//        X x = new Y(18);
//        System.out.println(x.abc());
//    }
//}
//
//
//class Y extends X {
//    public Y(int i) {
//        System.out.println("Y");
//    }
//    public boolean abc () {
//        return true;
//    }
//}
