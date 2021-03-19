public class P074_EchoTestDrive {

    //Задача из книги изучаем Java (Head First) стр.74
    public static void main (String[] args) {
        Echo e1= new Echo ();
       // Echo e2= new Echo ();  подойдет и так и так как в строке ниже
        Echo e2= e1;
        int x=0;
        while (x<4) {
            e1.hello ();
            // ???
            e1.count=e1.count+1;   // если без этой строки, то результат 10, с ней 24, как в звдвнии
            if (x>0) {
                e2.count = e2.count+1;
            }
            if (x>1) {
                e2.count = e2.count + e1.count;
            }
            x = x+1;
        }
        System.out.println(e2.count);
    }
}


class Echo {
    int count = 0;
    void hello () {
        System.out.println("Привеееет.....");
    }
}