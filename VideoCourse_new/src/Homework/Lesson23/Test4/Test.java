//package Homework.Lesson23.Test4;
//
//// Тест 4
//// не знаю, подходят оба варианта, вероятно ошибка...
////
//// Ответ: ошибка компиляции reference to abc is ambiguous
//
//class X {}
//class Y extends X {}
//
//
//public class Test {
//    public static void abc (X x, Y y) {
//        System.out.println("privet");
//    }
//
//    public static void abc (Y y, X x) {
//        System.out.println("poka");
//    }
//
//    public static void main(String[] args) {
//        Y a = new Y();
//        abc(a,a);
//    }
//
//}
