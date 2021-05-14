
package Homework.Lesson08;

/*
 Урок 8 Модификаторы «final» и «static». Понятие «константа».
 */

public class StaticLearning {
    
    static int ProizvedenieTrexChicel (int a, int b, int c) {
        System.out.print(a+"*"+b+"*"+c+"=");
        return a*b*c;
    }
    
    static void Delenie (int a, int b){
        System.out.println("Целая часть от деления "+a+"/"+b+"="+a/b);
        System.out.println("Остаток от деления "+a+"/"+b+"="+a%b);
    }
    
}

class Test {
    public static void main (String [] args){
         // первый способ вызова с созданием объекта StaticTest      
        StaticLearning t = new StaticLearning();
        System.out.println(t.ProizvedenieTrexChicel (5, 7, 10));
        
        // второй способ вызова без создания объекта
        int result = StaticLearning.ProizvedenieTrexChicel (25,37, 16);              
        System.out.println (result);
        
        t.Delenie (25,10);
        StaticLearning.Delenie(19, 5);
        
        
        
    }
}
