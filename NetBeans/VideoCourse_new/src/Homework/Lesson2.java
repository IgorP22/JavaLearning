
package Homework;

   /*
     Домашнее задание.
     Урок 2 Примитивные типы данных. Понятие «переменная». Системы счисления.
     */

public class Lesson2 {
    public static void main (String [] args) {
        byte b1 = 0b1100;
        byte b2 = 0_14;
        byte b3 = 12;
        byte b4 = 0xC;

        System.out.println(b1 + " "+b2 + " " + b3 +" "+ b4);

        short s1 = 0b10100010100;
        short s2 = 0_2424;
        short s3 = 1300;
        short s4 = 0x514;

        System.out.println(s1 + " "+s2 + " " + s3 +" "+ s4);

        int i1 = 0b0;
        int i2 = 0_0;
        int i3 = 0;
        int i4 = 0x0;

        System.out.println(i1 + " "+i2 + " " + i3 +" "+ i4);

        long l1 = 0b111010110111100110100010101L;
        long l2 = 0_726746425L;
        long l3 = 123456789L;
        long l4 = 0x75BCD15L;

        System.out.println(l1+ " "+l2 + " " + l3 +" "+ l4);

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(bo1+ " "+bo2);

        float f1 = 3.14F;
        float f2 = 302250.55F;

        System.out.println(f1+ " "+f2);

        double d1 = 5.22255;
        double d2 = 3.12225D;

        System.out.println(d1+ " "+d2);


        char c1 = 'd';
        char c2 = 100;
        char c3 = '\u0064';

        System.out.println(c1+ " "+c2 + " "+ c3);



    }
    
}
