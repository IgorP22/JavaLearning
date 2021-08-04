package Homework.Lesson22;

public class Test4 {

    void uvelichenieZP (Employee e) {
        e.salary = e.salary+100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age=50;
        doc.experience=25;
        doc.eat();
        //doc.specialization="hirurg";
        doc.sleep();
        doc.lechit();
    }


}

class Employee {  // аналог class Employee extends java.lang.Object
    String name;
    int age;
    int experience;
    double salary = 100;


    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }


}

class Doctor extends Employee {

    void lechit() {
        System.out.println("Lechit");
    }
}

class Hirurg extends Doctor {
    String skalpel;
    void operacia () {

    }
}

class Dentist extends Doctor {
    String bor;
    void lechitZub () {

    }
}



class Teacher extends Employee {
    String kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver {

    String car;

    void vodit() {
        System.out.println("Vodit");
    }
}
