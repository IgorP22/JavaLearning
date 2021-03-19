public class P073_DrumKitTestDrive {

    //Задача из книги изучаем Java (Head First) стр.73

    public static void main (String [] args) {
        P073_DrumKit d= new P073_DrumKit ();



        d.playSnare();

        d.snare = false;

        if (d.snare == true) {
            d.playSnare ();
        }

        d.playTopHat ();

    }
}