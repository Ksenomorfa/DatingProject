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
public class LoopWhileWithIfOne {

    public static void main(String[] args) {
        /*//Треугольник прямой
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k == 0 || k == i || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
 /*Прямуоугольник с пересечением
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                if (k == 0 || k == i || k == count - i - 1 || k == count - 1 
                        || i == 0 || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */
 /*Треугольник наоборот
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count; k++) {
                if (k == count - 1 || k == count-i-1 || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */

        int count1 = 6;
        int count2 = 11;
        for (int i = 0; i < count1; i++) {
            for (int k = 0; k < count2; k++) {
                if (k == (count2-1)/2 || i == count1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*        int number = 5;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Unknown");
        }
         */
    }
}
