class P050_Shuffle1 {

    //Задача из книги изучаем Java (Head First) стр.50

    public static void main (String [] args) {

        int x=3;
        while (x>0) {

            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
            }

            x = x - 1;
            System.out.print("-");
        }

    }

}
