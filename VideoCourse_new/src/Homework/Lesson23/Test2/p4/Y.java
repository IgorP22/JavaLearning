//package Homework.Lesson23.Test2.p4;
//import Homework.Lesson23.p3.*;
//
////Test 2
////Ответ: Результат работы будет -
//// 'Y'
//// 'Y'
//// 'Y'
//
//// Не верно: run-time error при вызове x.abc
//// abc() has protected access in Homework.Lesson23.p3.X
//// какаято фигня с этим, если меняем модификатор на public (запускаем) а потом на protected (запускаем) все запускается и выводит как написано
//// а если на privat, а потом обратно на protected не работает
//
//public class Y extends X {
//    public void abc () {
//        System.out.println('Y');
//    }
//
//    public void def () {
//        Y y = new Y();
//        y.abc();
//    }
//
//    public void ghi() {
//        X x = new Y();
//        x.abc ();
//    }
//
//    public static void main(String[] args) {
//        Y a = new Y();
//        a.abc();
//        a.def();
//        a.ghi();
//    }
//
//
//}
