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
public class AppObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(A1.class);

        try {
            Class.forName("ru.date.world.education.A1");
            System.out.println(A1.a1(2,4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
