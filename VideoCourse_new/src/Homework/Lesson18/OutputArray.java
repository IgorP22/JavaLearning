package Homework.Lesson18;

/*
Урок 18 Понятие «массив». Работа с массивами.
 */

public class OutputArray {

    public static void showArray(String[][] array) {
        System.out.print("{ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("{");

            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }


            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }

        }
        System.out.println(" }");


    }


    public static void main(String[] args) {
        String[][] array = new String[3][];
        array[0] = new String[]{"Test", "of", "output"};
        array[1] = new String[]{"word1", "word2", "word3", "word4", "word5", "word6"};
        array[2] = new String[]{"word7", "word8", "word9", "word10"};

        showArray(array);

    }


}
