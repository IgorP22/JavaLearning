
package Homework.Lesson06;

/*
Урок 6  Перегрузка методов и конструкторов (overloading). Ключевое слово this
*/

public class MetodOverloading {
    
    
    // разные варианты перезагрузки методов
    
    int summaChisel (int a, int b, int c, int d) {
        int result = a+b+c+d;
        System.out.println("Summa chisel "+a+"+"+b+"+"+c+"+"+d+"="+result);
        return result;
    }  
    
    int summaChisel (int a, int b, int c) {
        int d = this.summaChisel(a, b, c, 0);
        return d;
        
        /*
        int result = a+b+c;
        System.out.println("Summa chisel "+a+"+"+b+"+"+c+"="+result);
        return result;*/
    } 
    
    int summaChisel (int a, int b) {
        return this.summaChisel(a, b, 0, 0);
        /*
        int result = a+b;
        System.out.println("Summa chisel "+a+"+"+b+"="+result);
        return result;*/
    }  
    
    int summaChisel (int a) {
        return a;
        /*
        int result = a;
        System.out.println("Summa chisel "+a+"="+result);
        return result;
        */
    }  
    
    void summaChisel () {
        System.out.println("Parametrov net, result=0");       
    }  

}



class MetodOverloadingTest {
    
    public static void main (String [] args) {
        
    MetodOverloading s1 = new MetodOverloading ();
    s1.summaChisel(5, 10, 9, 1);
    s1.summaChisel(5, 10, 9);
    s1.summaChisel(5, 10);
    s1.summaChisel(5);
    s1.summaChisel();
       
    }
    
}
