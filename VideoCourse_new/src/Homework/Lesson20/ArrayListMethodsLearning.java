package Homework.Lesson20;
import java.util.ArrayList;


// изучаем методы ArrayList
public class ArrayListMethodsLearning {

    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <String> list3 = new ArrayList<>();
        ArrayList <StringBuilder> list4 = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder("number 1");
        StringBuilder sb2 = new StringBuilder("number 2");
        StringBuilder sb3 = new StringBuilder("number 3");

        list4.add(sb1);
        list4.add(sb2);
        list4.add( new StringBuilder("number 4"));

        for (StringBuilder sb : list4) {
            System.out.print(sb + " ");
        }


        System.out.println();
        //ищменяум элементы с помоьщю append

        for (int i = 0; i< list4.size(); i++) {
            list4.get(i).append("!!");
        }

        for (StringBuilder sb : list4) {
            System.out.print(sb + " ");
        }


        System.out.println();

        // добавление элементов в список
        list1.add ("place #1");
        list1.add ("place #2");
        list1.add ("place #4");

        System.out.println(list1);

        // вставка на определенный индекс
        list1.add (2,"place #3");
        System.out.println(list1);

        // получаем элемент с определенным индексом
        System.out.println(list1.get (2));



        // заменяем элемент с заданным индеском на указанный в параметрах
        list1.set (1,"place #1.5");
        System.out.println(list1);


        // можно изменить элементы ArrayList без использования его методов





        // удаление элемента или по индексу или по содержимому

        // все операции по содержимому работают с объектами, т.е.
        // в типе не String, такой вариант ничего не удалит
        // метод возвращает тип boolean true - элемент удалился, false не удалился
        // при выходе за пределы листа, ошибка выполнения

        list1.remove("place #1.5");
        list1.remove(1);

        list4.remove("number 4"); // ничего не удалилось
        list4.remove(sb2); // удаление прошло нормально
        System.out.println(list4);

        System.out.println(list1);


        list2.add ("place #2");
        list2.add ("place #3");
        list3.add ("place #5");
        list3.add ("place #6");

        // добавление списка в список, либо в конецб либо с укзанного индекса
        list1.addAll(list3);
        System.out.println(list1);
        list1.addAll(1, list2);
        System.out.println(list1);
        // при работе с типом стринг изменения в добавленном списке (list3) никак не влияют
        // на общий список (list1)

        // в варианте со StringBuilder и т.п. изменения элемента затронут и общий список тоже
        ArrayList <StringBuilder> list6 = new ArrayList<>();
        ArrayList <StringBuilder> list7 = new ArrayList<>();
        list6.add (new StringBuilder("element 1"));
        list6.add (new StringBuilder("element 2"));
        list6.add (new StringBuilder("element 3"));
        list7.add (new StringBuilder("element 4"));
        list7.add (new StringBuilder("element 5"));
        System.out.println(list6);
        System.out.println(list7);
        list6.addAll(list7);
        System.out.println(list6);

        // меняем содержимое в списке, который добавляли
        list7.get(1).append(.5);
        // содержимое изменилось в обоих списках
        System.out.println(list6);

        // т.е. если мы в list7 полностью меняем объекты, то на list6 это никак не отразится
        // но если мы меняем содержимое, то это изменения сработает а обоих списках


        System.out.println( list3);

        // очищаем список полностью
        list3.clear();
        System.out.println( list3);

        // опять же все актуально как и для методов выше
        // поиск и сравнение происходит с использованием метода equals


        System.out.println(list1.indexOf("place #2"));

        list1.add ("place #2");
        list1.add ("place #2");

        // получаем индекс элемента, первого
        System.out.println(list1.indexOf("place #2"));
        // или последнего в списке
        System.out.println(list1.lastIndexOf("place #2"));
        // если объект не найден, результат -1


        // получаем длину списка
        System.out.println(list1.size());
        // проверяем пустой ли список
        System.out.println(list1.isEmpty());
        System.out.println(list3.isEmpty());

        // проверка содержит ли список опрделенный єлемент
        // опять же поиск  происходит с использованием метода equals
        System.out.println(list1.contains("place #2"));
        System.out.println(list3.contains("place #7"));

        // пробразование списка в строку
        String str1, str2;
        str1 = list2.toString();
        str2 = "[place #2, place #3]";

        System.out.println(list2);
        System.out.println("строка " + str1);
        System.out.println(str1.equals(str2));
        System.out.println(str1.length()+" "+str2.length());












    }

}
