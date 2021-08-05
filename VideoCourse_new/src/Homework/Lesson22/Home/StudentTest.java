package Homework.Lesson22.Home;

class Student {

    private StringBuilder name;

    public void setName(StringBuilder name) {

        if (name.length()>2) {
            this.name = name;
        } else {
            System.out.println("Имя задано неверно");
            this.name = new StringBuilder("Error");
        }

    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);

        return sb;
    }


    private int course;

    public void setCourse(int course) {
        if (course>=1 & course<=4) {
            this.course = course;
        } else {
            System.out.println("Курс задан неверно");
        }

    }

    public int getCourse() {
        return course;
    }


    private int grade;

    public void setGrade(int grade) {
        if (grade>=0 & grade<=10) {
            this.grade = grade;
        } else {
            System.out.println("Оценка задана неверно");
        }





    }

    public int getGrade() {
        return grade;
    }

    public void showInfo(Student s) {
        System.out.println(s.getName());
        System.out.println(s.getCourse());
        System.out.println(s.getGrade());
    }


}


public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Iv"));
        s.setCourse(41);
        s.setGrade(15);

        s.getName().append("!!!!");


        s.showInfo(s);

        Student s1 = new Student();
        s1.setName(new StringBuilder("Ivan"));
        s1.setCourse(4);
        s1.setGrade(8);
        s1.showInfo(s1);




    }

}
