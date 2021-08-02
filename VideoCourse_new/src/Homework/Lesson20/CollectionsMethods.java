package Homework.Lesson20;
import java.util.ArrayList;
import java.util.List;

public class CollectionsMethods {
// дополнительные методы
/*
removeAll
retainAll
containsAll
subList
toArray
ListOf
ListCopyOf

 */

    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList <String> ();
        list1.add("№1");
        list1.add("№2");
        list1.add("№3");
        list1.add("№4");
        list1.add("№5");
        list1.add("№6");


        ArrayList <String> list2 = new ArrayList <String> ();
        list2.add("№1");

        list2.add("№3");


        list2.add("№6");
        list2.add("№10");

        System.out.println(list1);
        System.out.println(list2);


        //list1.removeAll(list2); //метод удаляет из list1, элементы совпадающие с элементами list1
        //list1.retainAll(list2);  //метод оставляет в  list1, только элементы совпадающие с элементами list1
        System.out.println(list1.containsAll(list2)); // метод проверяет есть ли в list1, все элементы из list1 (выдает true или false)
        System.out.println(list1);

        // создает подсписок из списка, в параметрах индес первого и последнего элемента
        List <String> list3 = list1.subList(1,3); // последний не включительно
        System.out.println(list3);

        // при добавлении в подсписок, элемент добавится и в исходный список тоеж
        list3.add("#10");
        System.out.println(list3);
        System.out.println(list1);

        list1.add("#15");
        System.out.println(list1);
        // при изменении основного списка, далее пользоваться подсписком нельзя
        // все модификации нудно проводить через подсписок, иначе получим .ConcurrentModificationException
        //System.out.println(list3);

        //преобразованеи списка в массив
        Object [] arr1 = list1.toArray(); // тип Object
        String [] arr2 = list1.toArray(new String[10]); // если нужен другой тип, пишем так
        // размер массива можно задать меньше списка, тогда создастя массив ровно по длине списка
        // если больше, то остальные элементы заполняться null

        for (String s: arr2) {
            System.out.print(s+" ");
        }
        System.out.println();

        // создание списка без использования метода add
        // при таком создании список получается немодифицированным
        // при попытке изменения выходит ошибка
        List <String> list4 = List.of("#11", "#12", "#16");
        System.out.println(list4);
        // тоже немодифицированный список, изменять его нельзя
        // также в такие списки нельзя добавить null
        List <String> list5 = List.copyOf(list1);
        System.out.println(list5);





    }
}
