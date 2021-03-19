//Задача из книги изучаем Java (Head First) стр.94

public class P094_TestArrays {
    public static void main (String [] args) {

        // присваиваем сразу при объявлении массивов, не как в книге
        int [] index = new int [] {1,3,0,2};
        String [] islands = new String [] {"Бермуды", "Фиджи", "Азор", "Косумель"};

        int y=0;

        int ref;
        while (y<4) {
            ref=index[y];
            System.out.print("отсрова = ");
            System.out.println(islands[ref]);
            y=y+1;
        }


    }
}
