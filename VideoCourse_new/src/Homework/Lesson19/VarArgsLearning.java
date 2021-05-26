package Homework.Lesson19;

/*
Урок 19  Параметры метода типа varargs. Аргументы типа command line. Цикл «forea

Задание: преобразовать varargs String в одномерный массив типа String,
все элементы полученного массива заменить на null, если они совпадают
с элементами, переданными из командной строки


 */

public class VarArgsLearning {

    public static String[] abc(String[]... array) {

        String[] array1;
        int abcLength = 0; //переменная для получения длины одномерного массива

        for (int i = 0; i < array.length; i++) {
            abcLength += array[i].length;
        }

        array1 = new String[abcLength];  //определяем новый одномерный массив стринг


        // заполнение одномерного массива всеми элементами из вараргс
        int z = 0;
        for (String a[] : array) {
            for (String b : a) {
                array1[z] = b;
                z++;
            }
        }

        return array1;

    }

    public static void zamenaElementov(String[] array1, String[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (String a : array2) {
                /*
                Без проверки на неравенство элемента с  null, выдает NullPointerException
                т.е. вариант проверки null.equals любому значению невозможен

                час искал причину.....
                */
                if (array1[i] != null && array1[i].equals(a)) {
                    array1[i] = null;

                }
            }
        }

        showArray(array1);

    }

    public static void showArray (String [] array) {
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {

        String[] array;
        array = abc(new String[]{"privet", "poka", "ok"},
                new String[]{"data1", "data2"},
                new String[]{},
                new String[]{"test1", "test2", "test3", "test4", "test5"},
                //new String[]{""},
                new String[]{"data1", "test2", "test3", "poka"});

        showArray(array);

        //System.out.println(args.length);

        zamenaElementov(array, new String[]{"poka", "test2"});

        // в варианте сравнения с элементами из командной строки вызов метода выглядит так:
        // zamenaElementov(array, args);
    }
}
