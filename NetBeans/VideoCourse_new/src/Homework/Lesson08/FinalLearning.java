
package Homework.Lesson08;

/*
 Урок 8 Модификаторы «final» и «static». Понятие «константа».
 */

public class FinalLearning {
    
    static final double PI = 3.14;
    
    
    double PloshadCruga(int r) {
       return PI*r*r; 
    }
    
    static double DlinaOkr (int r) {
       return  2*PI*r;
    }
    
    void ShowInfo (int r){
       System.out.println("Радиус круга = "+r);
       System.out.println("Площадь круга = "+PloshadCruga(r));
       System.out.println("Длина окружности = "+DlinaOkr(r));
    }
    
    
}


class FinalLearningTest {
    public static void main (String [] args){
        //константа доступна без создания объекта
        System.out.println("Пи = "+FinalLearning.PI);
        //статик метод используем не создавая объект
        double result;
        int radius = 5;
        result=FinalLearning.DlinaOkr(radius);
        System.out.println("Длина окружности с радиусом "+radius+" = "+result);
        
        
        //для остальных методов объект нужен
        FinalLearning t1 = new FinalLearning();
        radius = 10;
        result = t1.PloshadCruga(radius);
        System.out.println("Площадь круга с радиусом "+radius+" = "+result);
        
        radius = 3;
        
        t1.ShowInfo(radius);
        
        
    }
}
