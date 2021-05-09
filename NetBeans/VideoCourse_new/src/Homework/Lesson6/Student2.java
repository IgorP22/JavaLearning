
package Homework.Lesson6;

/*
Урок 6  Перегрузка методов и конструкторов (overloading). Ключевое слово this
*/

public class Student2 {
    int TickeNumber;
    String Name;
    String Surname;
    int YearOfStudy;
    double AverageMathGrade;
    double AverageEconomyGrade;
    double AverageLanguageGrade;
    
    
    Student2 (int t1, String n1, String s1, int y1, double m1, double e1, double l1){
     TickeNumber=t1;
     Name = n1;
     Surname = s1;
     YearOfStudy = y1;
     AverageMathGrade = m1;
     AverageEconomyGrade = e1;
     AverageLanguageGrade = l1;   
       
    }
    
    Student2 (int t2, String n2, String s2, int y2){
        this (t2,n2,s2,y2,0.0,0.0,0.0);
     /* или так:
        
     TickeNumber=t2;
     Name = n2;
     Surname = s2;
     YearOfStudy = y2;*/
       
    }
    
    Student2 (){           
    }
    
    
    
    
    
    }
    


// в решении дз не вписывали метод расчета в существующий класс, а создали новый

class calculatingSrednegoArifm {
     void sredneeArifm (Student2 s){
        System.out.println("Средняя оценка студента "+s.Name + " " + s.Surname
        + ": " +(s.AverageMathGrade + s.AverageEconomyGrade
        + s.AverageLanguageGrade)/3);
    }
    
}



class StudentTest {
    
    
    
    
    public static void main(String[] args) {
    Student2 St1 = new Student2(15,"Sergey","Petrov",3,4.7,4.1,3.8);
    Student2 St2 = new Student2(12,"Alex","Ivanov",1);
    Student2 St3 = new Student2();



  
    calculatingSrednegoArifm t = new calculatingSrednegoArifm();
    t.sredneeArifm(St1);
    t.sredneeArifm(St2);
    t.sredneeArifm(St3);
    }
    

}
   
