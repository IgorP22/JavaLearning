package Homework.Lesson17;

//дополнение к уроку 17
// изучение методов StringBuilder

public class StringBuilderMethodsLearning {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Длинная строка текста для 1 для эксперимантов для   ");
        StringBuilder s2 = new StringBuilder("    Тест   ");
        StringBuilder s3 = new StringBuilder("0123456789");
        StringBuilder s4 = new StringBuilder();
        StringBuilder s5 = new StringBuilder("       ");
        StringBuilder s6 = new StringBuilder("0123456789");


        //length как обычно длина
        System.out.println(s1.length());

        //индекс первого совпадения символа
        // в случае неправильного индексаб отризательного или больше длины
        // ошибка .StringIndexOutOfBoundsException
        // если нет совпадений -1
        //т.е. ошибки в индексе не прощаются
        System.out.println(s3.charAt(7));

        System.out.println(s1.indexOf("для"));
        System.out.println(s1.indexOf("для",23));
        System.out.println(s1.indexOf("для",43));

        System.out.println(s1.substring(40));
        // как обычно, последний не входит в результат
        System.out.println(s3.substring(3,7));

        System.out.println(s1.append(s2));
        //append изменяет объект StringBuilder, в отличии от String
        System.out.println(s1);

        // обратить внимание на типы, метод вовращет CharSequence
        System.out.println(s1.subSequence(10,25));

        // при цепочке методов, они выполняются последовательно слева направо.
        s4.append(s1.subSequence(10,25));
        System.out.println(s4);

        System.out.println(s3.insert(3,s2));
        System.out.println(s3);

        s3.delete(3,14);
        System.out.println(s3);

        System.out.println(s2.reverse());
        System.out.println(s2.replace(3, 8, "Test"));
        System.out.println(s2);
        System.out.println(s5.length()+" "+s5.capacity());

        char array [] = {'1','2','3','4','5'};

        //  в параметрах укзывается с какого и сколько символов добавить
        s3.append(array,2,3);
        System.out.println(s3);

        // аналогично верхнему, но еще указано, на какую позицию вставлять
        s6.insert(5,array,2,3);
        System.out.println(s6);

        // Итого большинство методов изменяет сам стрингбилдер,
        // в отличии от стринга, который не изменяется





    }
}
