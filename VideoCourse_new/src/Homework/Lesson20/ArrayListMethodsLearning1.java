package Homework.Lesson20;
import java.util.*;


// изучаем методы ArrayList продолжение
public class ArrayListMethodsLearning1 {
    public static void main(String[] args) {

        ArrayList <StringBuilder> list4 = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder("number 1");
        StringBuilder sb2 = new StringBuilder("number 2");
        StringBuilder sb3 = new StringBuilder("number 3");

        list4.add(sb1);
        list4.add(sb2);
        list4.add(sb3);
        list4.add( new StringBuilder("number 4"));

        for (StringBuilder sb : list4) {
            System.out.print(sb + " ");
        }
        System.out.println();

        //ArrayList<StringBuilder> list5 = list4.clone();
        // так не работает из за того что не совпадают типы, тип метода clone - Object


        ArrayList<StringBuilder> list5 = (ArrayList<StringBuilder>) list4.clone();

        // метод clone создает новый ArrayList, но его эелементы ссылаются на теже самые объекты
        System.out.println(list4 == list5 ); // Объекты разные
        System.out.println(list4.get(1) == list5.get(1)); // но их элеемнты ссылаются на одни и те эе объекты

        // все актально как и для предыдущих вариантов
        // при изменение самого объекта исходного списка, на клонированном списке это никак не отразится
        // а при изменении содержимого, изменения затронут оба списка
        System.out.println(list4);
        System.out.println(list5);

        list4.get(0).append(".5"); // изменились оба
        list4.set(0, new StringBuilder("number 0.9")); // изменился только 1

        System.out.println(list4);
        System.out.println(list5);



        // преобразование списка в массив

        // по умолчанию
        Object [] arr1 = list4.toArray();
        for (Object o: arr1) {
            System.out.print(o+" ");
        }
        System.out.println();

        // с указанием типа
        // если указать размер больше, остаток заполнится null
        // если меньше, то создастся массив с длинной равной длине списка
        StringBuilder [] arr2 = list4.toArray(new StringBuilder[list4.size()]);
        for (StringBuilder s: arr2) {
            System.out.print(s+" ");
        }
        System.out.println();

        list4.get(0).append("00"); // при изменении значения элемента в списке, элемент в массиве тоже изменится
        for (Object o: arr1) {
            System.out.print(o+" ");
        }
        System.out.println();

        // обратное преобразование
        // данный список полностью связан с массивом и он той же длины
        // любое изменение в массиве отразится на списке
        List <StringBuilder> list6 = Arrays.asList(arr2);
        System.out.println(list6);

        arr2[0].append("111");
        arr2[1] = new StringBuilder("test");
        System.out.println(list6);
        list6.get(0).append("----");
       // list6.add(new StringBuilder("proba")); // так сделать нельзя

        // список и массив связаны, изменения в массиве меняет список, и наоборот
        // но добавить элемент в список нельзя, т.к. нельзя добавить элемент в массив
        System.out.println(list6);
        for (StringBuilder s: arr2) {
            System.out.print(s+" ");
        }
        System.out.println();

        // сортировка с помощью коллекций

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("B");
        list1.add("F");
        list1.add("A");
        list1.add("E");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        // сравнение
        // метод equals в ArrayList перезаписан
        ArrayList <String> list2 = list1;
        System.out.println(list1.equals(list2));

        ArrayList <String> list3 = new ArrayList<>();



        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add("E");
        list3.add("F");

        System.out.println(list1.equals(list3));














    }

}
