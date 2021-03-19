public class P069_GuessGame {
    //Задача из книги изучаем Java (Head First) стр.69
    P070_Player p1;
    P070_Player p2;
    P070_Player p3;

    public void startGame () {
        p1 = new P070_Player ();
        p2 = new P070_Player ();
        p3 = new P070_Player ();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9....");

        while (true) {
            System.out.println("Загаданное число - "+targetNumber);
            p1.guess ();
            p2.guess ();
            p3.guess ();

            guessp1 = p1.number;
            System.out.println("Чило первого игрока - " + guessp1);
            guessp2 = p2.number;
            System.out.println("Чило второго игрока - " + guessp2);
            guessp3 = p3.number;
            System.out.println("Чило третьего игрока - " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Победа!");
                System.out.println("Первый игрок угадал?  " + p1isRight);
                System.out.println("Второй игрок угадал?  " + p2isRight);
                System.out.println("Третий игрок угадал?  " + p3isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Никто не угадал, пробуем еще раз....");
            }

        }


    }
}
