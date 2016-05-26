/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.date.world.education;
import java.io.IOException;
import java.util.Date;        
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Это класс для печати и обучения
 * @author polina
 */
public class Print {
    
    /**
     * Тестовый метод
     * @param args - Передаваемые параметры
     */
    public static void main(String [] args) {
        p("Привет","utf-8");
   
    }
    
    /**
     * 
     * @param text - Текст для печати
     * @param cp - Кодовая страница
     */
    public static void p(String text, String cp) {
        try {
            System.out.write((text + " " + new Date()).getBytes(cp));
        } catch (IOException ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
