package Homework.Lesson18;
import java.util.Arrays;

// дополнение к уроку 18
// изучение методов Array

public class ArrayMethodsLearning {
    public static void main (String [] args) {

        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {7, 15, 2, 0, -4, 8, 3, 2, 11};
        int [] arr3 = {1,2,3,5};
        int [] arr4 = {1, 2, 3, 4, 5};
        int [] arr5 = {5, 4, 3, 2, 1};
        int [] arr6 = null;
        int [] arr7 = {5, 4, 3, 2, 1};

        // сортировка с помощью  метода sort
        Arrays.sort(arr2);
        for (int i : arr2){
            System.out.print(i + " ");
        }
        System.out.println();

        // binarySearch работает только в отсортированном массиве
        // выдает индекс или отрицательное число если элемента нет
        System.out.println(Arrays.binarySearch(arr5, 4));
        Arrays.sort(arr5);
        System.out.println(Arrays.binarySearch(arr5, 4));

        // compare
        // 0 массивы одинаковы, отрицательное значение когда первый массив меньше второго
        // и положительное занчение когда наоборот
        // сравнение происходит по методу лексикографического сравнение (как в словаре)
        // null массив всегда меньше не пустого масиива

        System.out.println(Arrays.compare(arr4, arr3));
        System.out.println(Arrays.compare(arr4, arr1));
        System.out.println(Arrays.compare(arr4, arr6));
        System.out.println();

        // mismatch
        // находит индекс первого расхождения массивов, или -1 если они одинаковые
        System.out.println(Arrays.mismatch(arr7,arr4));
        System.out.println(Arrays.mismatch(arr1,arr4));
        System.out.println(Arrays.mismatch(arr1,arr3));




    }

}
