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
public class LoopWhile {

    public static void main(String[] args) {
        int count = 10;
        int i = 0;
        while (i < count) {
            int k = count;
            while (k > i + 1) {
                System.out.print("*");
                k--;
            }
            System.out.println();
            i++;
        }

        int l = 0;
        do {
            System.out.print("*");
        } while (++l < count);
        System.out.println();
        
        int number = 1;   // Начальное число
        int sum = 0;      // Переменная для хранения суммы
        int count2 = 0;    // Количество чисел - в начале ни одного
        int max = 300;    // Предел суммы
 
        for(;;) {
           sum += number;    // Увеличиваем сумму
           if(sum > 300) {   // Проверяем сумму - если больше
               break;            // То эта точка является точкой выхода
           } else {
               count2++;          // А здесь просто увеличиваем количество чисел
               //System.out.println("number");
           }
           number += 10;    // Увеличиваем число на 10
           System.out.println(number);
        }
        System.out.println(sum);
        System.out.println("Count2=" + count2);
    }
}
