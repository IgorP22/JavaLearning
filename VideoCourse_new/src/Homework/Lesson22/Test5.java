package Homework.Lesson22;

public class Test5 {
}

class Human2 {
    Human2 (String n) {
        this(n,null); // обращение с перегруженному конструктору того же класса
    }

    Human2 (String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;
}


class Student2 extends Human2 {
    Student2(){
        super("Ivan"); // обращение к конструктору родителя

    }

    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println(s.name+" "+s.surname);

    }
}
