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
public class A1 {
    private static long id;
    public static int a1(int a, int b) {
        return a+b;
    }
    static {
        id = System.currentTimeMillis();
        System.out.println("-----class A1----- " + id);
    }
}
