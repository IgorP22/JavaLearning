package Homework.Lesson12;

/*
Урок 12 Конструкции «if» и «if   else». Ternary оператор.
 */

import Homework.Lesson11.Student;


public class StudentTest {

    public void SravnenieLogical(Student st1, Student st2) {


        ShowInfo(st1, st2);
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade)
            System.out.println("Студенты равны");
        else
            System.out.println("Студенты разные");

    }

    public void SravnenieNestedIf(Student st1, Student st2) {
        ShowInfo(st1, st2);
        if (st1.name.equals(st2.name))
            if (st1.course == st2.course)
                if (st1.grade == st2.grade) {
                    System.out.println("Студенты равны");
                } else {
                    System.out.println("Первое различие между студентами в оценке");
                }
            else {
                System.out.println("Первое различие между студентами в курсе");
            }
        else {
            System.out.println("Первое различие между студентами в имени");
        }




    }

    public static void ShowInfo (Student st1, Student st2) {
        System.out.println("Сравниваем студентов");
        System.out.println(st1.name+"  "+st1.course+"  "+st1.grade);
        System.out.println(st2.name+"  "+st2.course+"  "+st2.grade);

    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 4, 4.3);
        Student st2 = new Student("Petr", 3, 4.7);
        Student st3 = new Student("Ivan", 4, 2.5);
        Student st4 = new Student("Ivan", 4, 4.3);
        Student st5 = new Student("Ivan", 2, 2.3);


        StudentTest t = new StudentTest();

        System.out.println("Вариант с логическим сравнением");
        t.SravnenieLogical(st1,st2);
        t.SravnenieLogical(st1,st4);

        System.out.println("Вариант с сравнением с помощью последовательных if");
        t.SravnenieNestedIf(st1, st4);
        t.SravnenieNestedIf(st1, st2);
        t.SravnenieNestedIf(st1, st3);
        t.SravnenieNestedIf(st1, st5);


    }


}
