public class P044_BeerSong {

    //Задача из книги изучаем Java (Head First) стр.44

    public static void main (String [] args)  {
        int beerNum = 99;
        String word;

        while (beerNum>0) {
           if (beerNum % 10 > 4 || beerNum % 10 ==0) {
               word = "бутылок";
           } else  word = "бутылки";
           if (beerNum==1) word = "бутылка";
           System.out.println(beerNum+" "+word+ " пива на стене");
           System.out.println(beerNum+" "+word+ " пива.");
           System.out.println("Возьми одну.");
           System.out.println("Пусти по кругу.");
           beerNum=beerNum-1;
           if (beerNum==0) System.out.println("Нет бутылок пива на стене.");
        }
    }
}
