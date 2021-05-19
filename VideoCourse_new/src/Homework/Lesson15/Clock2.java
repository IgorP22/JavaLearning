package Homework.Lesson15;

/*
Урок 15 Циклы «while» и «do while».
Аналог программы из урока 14, только с циклами while и do while
 */
public class Clock2 {

    public static void ShowTime(int hour, int minute, int second) {
        // просто для корректного вывода времени в формато 00:00:00

        System.out.print("0" + hour + ":");
        if (minute < 10) {
            System.out.print("0" + minute + ":");
        } else {
            System.out.print(minute + ":");
        }
        if (second < 10) {
            System.out.println("0" + second);
        } else {
            System.out.println(second);
        }


    }

    public static void Timer() {

        int hour = 0;

        OUTER:
        while (hour < 6) {

            int minute = -1;

            MIDDLE:
            do {
                minute++;

                if (hour > 1 && minute != 0 && minute % 10 == 0) {
                    System.out.println("Выход из метода");
                    break OUTER;
                }

                int second = 0;

                INNER:
                while (second<60){

                    if (second * hour > minute) {
                        System.out.println("Переходим на следующую минуту");
                        continue MIDDLE;
                    }

                    ShowTime(hour, minute, second);
                    second++;
                }

            } while (minute<59);// ошибка, изменил в начале на -1 минуту, но забыл изменить 60 на 59

            hour++;
        }

    }

    public static void main(String[] args) {
        Timer();
    }


}
