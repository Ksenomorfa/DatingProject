/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.date.world.education;

/**
 *
 * @author polina
 */
public class SomeNewClass {

    public static void main(String[] args) {
        int counter = 99;
        System.out.println("counter = " + counter);
        int a = 12;
        int b = 34;
        int c = b % a;
        //double d = ((double) b / (double) a);
        System.out.println("c = " + c);

        {
            b = 5;
            a = 12;
            c = ++a - b++;
            System.out.println("c = " + c);
            int d = b++ * 2;
            System.out.println("d = " + d);
        }

        boolean f1 = true;
        boolean f2 = false;
        boolean f3 = f1 || f2;
        boolean f4 = f1 && f2;
        System.out.println("f3 = " + f3 + " f4 = " + f4);

        boolean a1 = true;
        int b1 = 0;
        int b2 = 0;
        boolean result1 = a1 | (++b1 > 0); //здесь используется обычное ИЛИ, 
        //и проверяются обе части выражения 
        System.out.println("B1 = " + b1);
        boolean result2 = a1 || (++b2 > 0); //здесь используется ленивое Или
        // и проверяется только левая часть выражения
        System.out.println("B2 = " + b2);

        int count = 10;
        //Внешний цикл для повторения внутреннего
        for (int i = 0; i < count; i++) {
            //Внутренний цикл для печати одной строки
            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }
            //Переход на следующую строку 
            System.out.println();
            
         
        }
    }
}
