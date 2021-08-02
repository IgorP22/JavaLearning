package Homework.Lesson20;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

class Car {}
class Student {}

public class ArrayListLearning {
    public static void main(String[] args) {
        //ArrayList может принимать в себя любы референс типы данных
        // в основе ArrayList лежит массив типа Object
        // пример:
        Car c = new Car();
        Student s = new Student();
        ArrayList list = new ArrayList();
        list.add("Test1");
        list.add (c);
        list.add(s);
        list.add(new StringBuilder("SB1"));

        //но так приактически никогда не делается
        // обычно создается ArrayList определенного типа данных

        ArrayList <String> list2 = new ArrayList <String> ();
        list2.add("№1");
        list2.add("№2");
        list2.add("№3");
        list2.add("№4");
        list2.add("№5");
        list2.add("№6");
        // тип данных второй раз можно не указывать
        ArrayList <StringBuilder> list3 = new ArrayList<>();
        list3.add (new StringBuilder("ok1"));
        // возможна и следующая запись
        List <StringBuilder> list4 = new ArrayList<>();
        List <StringBuilder> list5 = new ArrayList ();


        // если в скобках указщывается число типа int - это capacity
        // только целое, положительное число, при отрицательном числе
        // Exception : Illegal Capacity:
        ArrayList <StringBuilder> list6 = new ArrayList<>(50);

        // в параметре можно указать другой List
        // при этом list7 ссылается на ДРУГОЙ объект

        ArrayList <String> list7 = new ArrayList <String> (list2);
        System.out.println(list7 == list2);

        Iterator <String> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //

        ListIterator<String> it1 = list7.listIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // в отличии от for each, Iterator позволяет удалять элементы
        ListIterator<String> it2 = list7.listIterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
        System.out.println(list7);

        Iterator <String> it3 = list7.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

    }
}
