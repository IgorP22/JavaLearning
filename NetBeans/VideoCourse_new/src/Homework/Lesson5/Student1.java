
package Homework.Lesson5;

/*
Урок 5 Создание объектов. Понятие «конструктор». Объявление и вызов методов.
*/

public class Student1 {
    int TickeNumber;
    String Name;
    String Surname;
    int YearOfStudy;
    double AverageMathGrade;
    double AverageEconomyGrade;
    double AverageLanguageGrade;
    
    void sredneeArifm (Student1 s){
        System.out.println("Средняя оценка студента "+s.Name + " " + s.Surname
        + ": " +(s.AverageMathGrade + s.AverageEconomyGrade
        + s.AverageLanguageGrade)/3);
    }
    
}

// в решении дз не вписывали метод расчета в существующий класс, а создали новый

class calculatingSrednegoArifm {
     void sredneeArifm (Student1 s){
        System.out.println("Средняя оценка студента "+s.Name + " " + s.Surname
        + ": " +(s.AverageMathGrade + s.AverageEconomyGrade
        + s.AverageLanguageGrade)/3);
    }
    
}



class StudentTest {
    
    static void sredneeArifm1 (Student1 s){
        System.out.println("Средняя оценка студента "+s.Name + " " + s.Surname
        + ": " +(s.AverageMathGrade + s.AverageEconomyGrade
        + s.AverageLanguageGrade)/3);
    }
    
    
    public static void main(String[] args) {
    Student1 St1 = new Student1();
    Student1 St2 = new Student1();
    Student1 St3 = new Student1();


    St1.TickeNumber=1;
    St1.Name = "Иван";
    St1.Surname = "Иванов";
    St1.YearOfStudy = 1;
    St1.AverageMathGrade = 3.7;
    St1.AverageEconomyGrade = 4.8;
    St1.AverageLanguageGrade = 4.6;

    St2.TickeNumber=1;
    St2.Name = "Василий";
    St2.Surname = "Васильев";
    St2.YearOfStudy = 3;
    St2.AverageMathGrade = 5;
    St2.AverageEconomyGrade = 4.6;
    St2.AverageLanguageGrade = 4.8;

    St3.TickeNumber=1;
    St3.Name = "Петр";
    St3.Surname = "Петров";
    St3.YearOfStudy = 2;
    St3.AverageMathGrade = 3.7;
    St3.AverageEconomyGrade = 2.5;
    St3.AverageLanguageGrade = 3.6;

    /*System.out.println("Средняя оценка студента "+St1.Name + " " + St1.Surname
            + ": " +(St1.AverageMathGrade + St1.AverageEconomyGrade
            + St1.AverageLanguageGrade)/3);
    System.out.println("Средняя оценка студента "+St2.Name + " " + St2.Surname
            + ": " +(St2.AverageMathGrade + St2.AverageEconomyGrade
            + St2.AverageLanguageGrade)/3);
    System.out.println("Средняя оценка студента "+St3.Name + " " + St3.Surname
            + ": " +(St3.AverageMathGrade + St3.AverageEconomyGrade
            + St3.AverageLanguageGrade)/3);*/
    St1.sredneeArifm(St1);
    St1.sredneeArifm(St2);
    St1.sredneeArifm(St3);
    sredneeArifm1(St1);
    sredneeArifm1(St2);
    sredneeArifm1(St3);
    // так делали в решении
    calculatingSrednegoArifm t = new calculatingSrednegoArifm();
    t.sredneeArifm(St1);
    t.sredneeArifm(St2);
    t.sredneeArifm(St3);
    }
    

}
   
