package Homework.Lesson22;

public class Human {


    public     String name;
    public static int salary = 150;

    int age=50;

    protected int exp = 10;

    private String suranme = "Ivanov";
    public String getSuranme () {
        return suranme;
    }
    public void setSuranme (String s) {
        suranme = s;
    }

    public void work () {
        System.out.println("Work");
    }
    public static void rest () {
        System.out.println("Rest");
    }
}

class Student extends Human {
    // все public элементы класса Human наследуются классом Student
    // даже если он находится в другом пакете


    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

        // если элемент класса private, он наследован быть не может т.к. виден только внутри класса
        // т.е. private элементы не наследуются
        //System.out.println(s.age);

        // но с помощью public геттеров и сеттеров можно его получить или изменить из любого пакета
        System.out.println(s.getSuranme());
        s.setSuranme("Petrov");
        System.out.println(s.getSuranme());

        // если модификатор доступа не указан т.е. dafault,
        // переменные и методы будут доступны внутри пакета, но не из других пакетов
        System.out.println(s.age);

        // protected работает как и dafault, но еще эти элементы видны всем наследникам класса
        // вне зависимости от того где эти наследники находятся
        System.out.println(s.exp);

    }
}


