package Homework.Lesson13;

/*
Урок 13 Конструкция «switch».
 */


public class Month {

    public void numberOfDays(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце №" + month + " 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце №" + month + " 30 дней");
                break;
            case 2:
                System.out.println("В месяце №" + month + " 28 дней");
                break;
            default:
                System.out.println("Месяца с таким номером не существует");
        }
    }

    public static void main(String[] args) {
        Month m1 = new Month();
        m1.numberOfDays(15);
        m1.numberOfDays(2);
        m1.numberOfDays(10);
        m1.numberOfDays(6);

    }


}
