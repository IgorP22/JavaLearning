package Homework.Lesson16;

/*
Дополнение к уроку 16.

Используем различные методы для String.
 */


import java.util.Locale;

public class StringMetodsLearning {

    public static void main(String[] args) {

        String s1 = "Длинное предложение для разнообразных тестов и для еще много чего";
        String s2 = "для";
        String s3 = "    Тест    ";
        String s4 = "    Тест        Тест    ";
        String s5 = "";
        String s6 = "    ";
        String s7 = "    Тест    ";
        String s8 = "    тест    ";
        String s9 = new String("    Тест    ");

        // length определение длины String
        System.out.println(s1.length());

        //charAt - получаем символ с заданной в параметрах позиции
        System.out.println(s1.charAt(12));

        //indexOf - выдает поцизию заданного чара или стринга в тексте
        // с параметрами чар или стринг  - получаем индекс первого совпадение или -1 если совпадений нет
        System.out.println(s1.indexOf('н'));
        System.out.println(s1.indexOf('6'));
        System.out.println(s1.indexOf(s2));
        // с параметрами (чар или стринг) + int  - получаем индекс первого совпадение
        // но начиная с заданной в параметрах позициии или -1 если совпадений нет
        System.out.println(s1.indexOf('н',18));
        System.out.println(s1.indexOf('6',18));
        System.out.println(s1.indexOf(s2,25));
        // в варианте lastIndexOf, все тоже самое но для получения индекса последнего элемента
        System.out.println(s1.lastIndexOf('н'));
        System.out.println(s1.lastIndexOf('9'));
        // в данном варианте рассматривается строка не с индекса, а с 0 до указанного индекса.
        // и находится адрес последнего подходящего элемента или -1 если совпадений нет
        System.out.println(s1.lastIndexOf(s2,49));
        //отрицательные значения индекса и значения более длины, ошибку не выдают
        //но результат при отрицательном значении всегда -1
        //при значении более длины при использовании lastIndexOf работает, как будто индекса нет вообще
        //т.е. на всю строку
        System.out.println(s1.indexOf('6',18880));
        System.out.println(s1.lastIndexOf(s2,18880));


        //принимает только String
        System.out.println(s1.startsWith("Дл"));
        System.out.println(s1.startsWith("н",33));
        System.out.println(s1.endsWith("чего"));
        System.out.println(s1.contains("чего"));

        //со значениями тут нучно аккуратнее
        //отрицательные и значения более длины строки выдают ошибку
        //StringIndexOutOfBoundsException
        System.out.println(s1.substring(5,15));
        System.out.println(s1.substring(35));

        //убирает пробелы в начале и в конце строки
        System.out.println(s3.trim());
        System.out.println(s4.trim());



        //принимает или 2 чара или 2 стринга
        System.out.println(s1.replace('н','Q'));
        System.out.println(s1.replace(" для ","QQQ"));
        System.out.println(s1.replace(" 15 ","QQQ"));

        //все ясно и так
        System.out.println(s4.concat(s1));
        System.out.println(s1.toUpperCase());
        System.out.println(s4.toLowerCase());

        // почему-то isBlank отсутствует......
        // ясно почему, метод добавлен начиная с 11 версии java, а у меня 8-я...
        // выдает true при отсутствии значимых символов, пробелы, табуляции и т.п. игнорируются
        System.out.println(s5.isEmpty());
        System.out.println(s6.isEmpty());
        System.out.println(s6.isBlank());

        //  в целом, аналог trim, но распознает больше символов типа пробел
        // опять же введен с 11й джавы, но рекомендовано использовать именно его

        //переустановлен jdk, все заработало
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());
        System.out.println(s4.stripTrailing());


        //со сравнением все понятно
        // == true только если переменные ссылаются на один объект
        // equals сравнивает содержимое объектов.....
        System.out.println(s3.equals(s7));
        System.out.println(s3==s7);
        System.out.println(s3==s9);
        System.out.println(s3.equals(s9));
        System.out.println(s3.equals(s8));
        System.out.println(s3.equalsIgnoreCase(s8));








    }
}
