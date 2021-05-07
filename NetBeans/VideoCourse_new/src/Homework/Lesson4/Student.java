
package Homework.Lesson4;

/*
 Домашнее задание.
 Урок 4 Понятия «класс» и «объект». Знакомство со ссылочными типами данных
 */

public class Student {
    int TickeNumber;
    String Name;
    String Surname;
    int YearOfStudy;
    double AverageMathGrade;
    double AverageEconomyGrade;
    double AverageLanguageGrade;
    
}

class StudentTest {
    public static void main(String[] args) {
    Student St1 = new Student();
    Student St2 = new Student();
    Student St3 = new Student();


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

    System.out.println("Средняя оценка студента "+St1.Name + " " + St1.Surname
            + ": " +(St1.AverageMathGrade + St1.AverageEconomyGrade
            + St1.AverageLanguageGrade)/3);
    System.out.println("Средняя оценка студента "+St2.Name + " " + St2.Surname
            + ": " +(St2.AverageMathGrade + St2.AverageEconomyGrade
            + St2.AverageLanguageGrade)/3);
    System.out.println("Средняя оценка студента "+St3.Name + " " + St3.Surname
            + ": " +(St3.AverageMathGrade + St3.AverageEconomyGrade
            + St3.AverageLanguageGrade)/3);


    }
}

