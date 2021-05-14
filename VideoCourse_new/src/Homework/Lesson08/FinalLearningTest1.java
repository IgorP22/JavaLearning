
package Homework.Lesson08;

/*
При вызове из другого файла в классе ничего не меняется
 */
public class FinalLearningTest1 {
    
        public static void main (String [] args){
        
        //статик метод используем не создавая объект
        double result;
        int radius = 8;
        result=FinalLearning.DlinaOkr(radius);
        System.out.println("Длина окружности с радиусом "+radius+" = "+result);
        
        
        //для остальных методов объект нужен
        FinalLearning t1 = new FinalLearning();
        radius = 7;
        result = t1.PloshadCruga(radius);
        System.out.println("Площадь круга с радиусом "+radius+" = "+result);
        
        radius = 4;
        
        t1.ShowInfo(radius);
        
        
    }
    
}
