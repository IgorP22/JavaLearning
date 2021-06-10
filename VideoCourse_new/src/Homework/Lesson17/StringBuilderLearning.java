package Homework.Lesson17;

/*
Урок 17 Всё о классе StringBuilder.
 */

public class StringBuilderLearning {

    public static boolean Ravenstvo (StringBuilder sb1, StringBuilder sb2) {
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Privet");
        System.out.println();
        System.out.println(Ravenstvo(sb1,sb2));
    }


}
