package Homework.Lesson16;

/*
Урок 16 Всё о классе String.
 */

public class StringLearning {



    public void Servers(String s1) {
        int count = 0;
        char c1 = '@';
        boolean b1 = false;
        System.out.println("Выводим адрес сервера :");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c1) {
                count++;
                b1 = true;
                continue;
            }

            if (b1 && s1.charAt(i) != '.') {
                System.out.print(s1.charAt(i));
            } else {
                if (b1 && s1.charAt(i) == '.') {
                    System.out.println();
                    b1 = false;
                }
            }
        }
        System.out.println("Всего адресов выведено:" + count);

    }

    public void DomenName(String s1) {
        int count = 0;
        System.out.println("Выводим адрес домена :");
        char c1 = '@';
        boolean b1 = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c1) {
                count++;
                b1 = true;
                continue;
            }

            if (b1 && s1.charAt(i) != ' ') {
                System.out.print(s1.charAt(i));
            } else {
                if (b1 && s1.charAt(i) == ' ') {
                    System.out.println();
                    b1 = false;
                }
            }
        }
        if (b1 == true) {
            System.out.println();
        }
        System.out.println("Всего адресов выведено:" + count);

    }

    public void FullEmail(String s1) {
        int count = 0;
        char c1 = '@';
        boolean b1 = false;
        int startOfAdress = 0;
        int endOfAdress = 0;

        System.out.println("Выводим полные адреса :");

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c1) {
                count++;
                for (int z = i; z > 0; z--) {
                    if (s1.charAt(z) == ' ') {
                        startOfAdress = z + 1;
                        break;
                    }
                }

                for (int j = i; j < s1.length(); j++) {
                    if (s1.charAt(j) == ' ') {
                        endOfAdress = j;
                        i = j;
                        break;
                    }
                }
                if (endOfAdress < startOfAdress) {
                    endOfAdress = s1.length();
                }
                System.out.println(s1.substring(startOfAdress, endOfAdress));
            }

        }
        System.out.println("Всего адресов выведено:"+count);
    }


    public static void main(String[] args) {
        String str1 = "Адрес Петра petr@yahoo.com ,  адрес Маши masha@gmail.com Это все....";
        String str2 = "Адрес Петра petr@yahoo.com , адрес Сергея serg@mail.ru , адрес Маши masha@gmail.com";
        String str3 = "petr@yahoo.com - Адрес Петра  , адрес Олега oleg@mail.ru , адрес Сергея serg@mail.ru , адрес Маши masha@gmail.com Это все....";
        StringLearning s1 = new StringLearning();

        s1.Servers(str1);
        s1.Servers(str2);
        s1.Servers(str3);


        s1.DomenName(str1);
        s1.DomenName(str2);
        s1.DomenName(str3);


        s1.FullEmail(str1);
        s1.FullEmail(str2);
        s1.FullEmail(str3);

    }
}
