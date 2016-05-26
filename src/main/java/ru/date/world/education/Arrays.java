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
public class Arrays {

    public static void main(String[] args) {
        int[] c = {1, 2, 3, 4, 5};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println("=========");

        int f[];
        //  f = {1,2,3};
        f = new int[5];
        f[1] = 5;
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
        System.out.println("=========");

        char k[][] = {{'t', 'e', 'e'}, {'n', 'a'}, {'f', 'f'}};
        for (int i = 0; i < k.length; i++) {
            System.out.println("next");
            for (int j = 0; j < k[i].length; j++) {
                System.out.println(k[i][j]);
            }
        }
        System.out.println("=========");

        char t[] = new char[5];
        t[0] = 'a';
        for (int i = 33; i < (33 + t.length); i++) {
            t[i - 33] = (char) i;
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
        System.out.println("=========");

        char x[] = new char[]{'a','d','f','g','h'};
    }

}
