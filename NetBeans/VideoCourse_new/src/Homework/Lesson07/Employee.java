
package Homework.Lesson07;

/*
Урок 7 Понятие «package». Модификаторы видимости (access modifiers).
 */
public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;
    
    
    public Employee (int id1, String surname1, int age1, double salary1, String dep1){
        /*id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;*/
        
        // приватный конструктор можем вызвать только внутри класса, больше нигде
        this (id1,surname1,age1,salary1);
        department = dep1;        
    } 
    
    
    private Employee (int id1, String surname1, int age1, double salary1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        
    } 
    
    Employee (int id1, String surname1, double salary1){
        id = id1;
        surname = surname1;
        salary = salary1;               
    } 
    
    
    
       
    
    public void showId (){
        System.out.println("ID работника:"+id);
    }
    
    public void showSurname (){
        System.out.println("Фамилия работника:"+surname);
    }
    
    public void showSalary (){
        System.out.println("ЗП работника:"+salary);
    }
    
    
}


class EmployeeTest {
    public static void main (String [] args) {
        Employee emp1 = new Employee (12,"Petrov",35,315.5,"IT");
        
        // нет возможности вывести ЗП стандартным методом, только через метод showSalary
        System.out.println("ID:"+emp1.id+"  Surname:"+emp1.surname+"  Salary:--");
        
        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();
        
        // нет возможности вызвать приватный конструктор
        //Employee emp2 = new Employee (12,"Petrov",35,315.5);
        
        Employee emp3 = new Employee (41,"Vasilyev",411.5);
        System.out.println("ID:"+emp3.id+"  Surname:"+emp3.surname+"  Salary:--");
        emp3.showId();
        emp3.showSurname();
        emp3.showSalary();
        
    }
    
}