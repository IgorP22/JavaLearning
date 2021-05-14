
package Homework.Lesson07_1;

import Homework.Lesson07.Employee;

/*
Урок 7 Понятие «package». Модификаторы видимости (access modifiers).
 */
public class EmployeeTest2 {
    public static void main (String [] args) {
        
        // из другого пакета доступен только публичный конструктор
        Homework.Lesson07.Employee emp1 = new Homework.Lesson07.Employee (12,"Petrov",35,315.5,"IT");
        
        // нет возможности вывести ЗП стандартным методом, только через метод showSalary
        // стандартным способом можно вывести только публичную переменную
        System.out.println("ID:--"+"  Surname:"+emp1.surname+"  Salary:--");
        
        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();
        
        // указывать пакет нет необходимости почему-то
        Employee emp5 = new Employee (25,"Ivanov",25,110.5,"Office");
        
        // нет возможности вывести ЗП стандартным методом, только через метод showSalary
        // стандартным способом можно вывести только публичную переменную
        System.out.println("ID:--"+"  Surname:"+emp5.surname+"  Salary:--");
        
        emp5.showId();
        emp5.showSurname();
        emp5.showSalary();        
        
        
        
        
        // нет возможности вызвать приватный конструктор
        //Employee emp2 = new Employee (12,"Petrov",35,315.5);
        
        // из другого пакета нет возможности вызвать конструктор без модификатора доступа
        /*
        Homework.Lesson7.Employee emp3 = new Homework.Lesson7.Employee (12,"Petrov",315.5);
        System.out.println("ID:"+emp3.id+"  Surname:"+emp3.surname+"  Salary:");
        emp3.showId();
        emp3.showSurname();
        emp3.showSalary();
        */
        
    }    
}
