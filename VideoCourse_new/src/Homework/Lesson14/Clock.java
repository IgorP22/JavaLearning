package Homework.Lesson14;

/*
Урок 14 Классический цикл «for». Выражения «break» и «continue».
 */

/*
Исправление ошибок:
Проверка перенесена в средний цикл, чтобы не было лишних бесполезных проверок
Изменен вызов статического метода без использования имени класса

Ошибки на работоспособность программы не влияют, но делают лишние действия

*/

public class Clock {

    public static void Timer() {

        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {


                if (hour > 1 && minute != 0 && minute % 10 == 0) {
                    System.out.println("Выход из метода");
                    break OUTER;
                }

                INNER:
                for (int second = 0; second < 60; second++) {

                    if (second * hour > minute) {
                        System.out.println("Переходим на следующую минуту");
                        continue MIDDLE;
                    }

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



                    /*if (hour > 1 && minute!=0 &&  minute % 10 == 0) {
                        System.out.println("Выход из метода");
                        break OUTER;*/


                    /*if (second * hour > minute) {
                        System.out.println("Переходим на следующую минуту");
                        continue INNER1;*/
                    // break INNER2;  можем использовать просто break внутреннего цикла
                }


            }
        }

    }

    public static void main(String[] args) {
        Timer();
    }

}
