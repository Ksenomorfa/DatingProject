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

import java.awt.GridLayout;
import javax.swing.JFrame;
 
public class ShapeFrame extends JFrame
{
    public ShapeFrame() {
        // Устанавливаем LayoutManager в виде таблицы 
        // размерами 2 строки на 3 столбца
        setLayout(new GridLayout(2, 3));
 
        // Создаем и "укладываем" на форму компоненты разных классов
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
 
        // Устанавливаем координаты и размеры окна
        setBounds(300, 200, 550, 350);
    }
}