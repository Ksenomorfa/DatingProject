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
public class TestVariable {
    public static void main(String[] args) {
        double first = 99;
        // Создаем экземпляр класса
        TestVariable tv = new TestVariable();
        System.out.println("Main method:" + first);     // Здесь мы увидим 99
        first=tv.testMethod(first);
        System.out.println("Main method:" + first);     // И здесь мы снова увидим 99
    }
 
    public double testMethod(double first) {
        System.out.println("Test method:" + first);      // Здесь мы увидим 99
        first = 11;
        System.out.println("Test method:" + first);      // Здесь мы увидим 11
        return first;
    }
}
