package Homework.Lesson18;

/*
Урок 18 Понятие «массив». Работа с массивами.
 */

public class ArraySorting {

    public static int[] sortirovka(int[] array) {


        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int x = array[i];
            array[i] = array[minIndex];
            array[minIndex] = x;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, -5, 8, 7, 4, 3, 0, 12, 18, -12, -12, -18, 0};
        sortirovka(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }


}
