/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.date.world.education;

import javax.swing.JFrame;
 
public class OvalFrame extends JFrame
{
    public OvalFrame() {
        // Создаем объект типа OvalComponent
        OvalComponent oc = new OvalComponent();
        // Используем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);
 
        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }
 
}
