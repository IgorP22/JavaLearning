package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

/*
Урок 20 Всё о классе ArrayList.
Домашняя работа.
 */

public class ArrayListHomework {


    public static ArrayList abc (String... st) {
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < st.length; i++) {
            if (!list.contains(st[i])) {
                list.add(st[i]);
            }


        }
        Collections.sort(list);
        for (String s:list) {
            System.out.print(s+" ");
        }
        System.out.println();
        return list;
    }






    public static void main(String[] args) {
        ArrayList <String> list1 =  abc(new String[]{"A", "C", "C", "A", "F", "X", "F","D"});
        System.out.println(list1);

    }
}
