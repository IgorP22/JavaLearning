
package Homework.Lesson05;

/*
Урок 5 Создание объектов. Понятие «конструктор». Объявление и вызов методов.
*/


public class Human {
    String name;
    Car car1;
    BankAccount bA;
    
    Human (String n){
        name = n;
    }
    
    void showInfo() {
        System.out.println("Имя клиента:"+name + "  Цвет машины:" + car1.color + "  Балланс счета:" + bA.ballance);
    }
}

class Car {
    String color;
    String engine;
    
    Car (String c, String e){
        color = c;
        engine = e;
    }

}

class BankAccount {
    int id;
    double ballance;
    
    BankAccount (int i, double b) {
        id = i;
        ballance = b;
    }
    
    double popolnenieScheta (double summ) {
        double result;
        result = ballance + summ; 
        System.out.println("Счет пополнен на сумму " + summ);
        return result;        
    }
    
    double snyatieSoScheta (double summ) {
        double result;
        result = ballance - summ; 
        System.out.println("Со счета снято " + summ);
        return result;        
    }
    
} 

class HumanTest {
    public static void main (String [] args) {
        Human h = new Human ("Petr");
        h.car1 = new Car ("yellow", "V12");
        h.bA = new BankAccount (12, 25.6);
        h.showInfo();
        h.bA.ballance = h.bA.popolnenieScheta(200);
        h.showInfo();
        h.bA.ballance = h.bA.snyatieSoScheta(125.55);
        h.showInfo();
        
    }
}