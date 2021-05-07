
package Homework.Lesson5;

/*
Урок 5 Создание объектов. Понятие «конструктор». Объявление и вызов методов.
*/

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;
    
    Employee (int i, String s, int a, double sa, String d) {
        id = i;
        surname = s;
        age = a;
        salary = sa;
        department = d;
    }
    
    double salaryDouble(){
        return salary *=2;
       
    }
    
    void showInfo (){
        System.out.println("Номер:"+id + "  Имя рабочего:"+surname + "   Возраст:"+age + "   Зарплата:"+salary + "   Отдел:"+department);
    }
}   
    
class EmployeeTest {
    
    public static void main(String[] args) {
        Employee Em1 = new Employee(12,"Сергей",22,350.5,"Бухгалерия");
        Em1.showInfo();
        Em1.salaryDouble();
        Em1.showInfo();
        Employee Em2 = new Employee(18,"Олег",44,550.5,"Производство");
        Em2.showInfo();
        Em2.salaryDouble();
        Em2.showInfo();
        
        
        
        
    }
}
    

