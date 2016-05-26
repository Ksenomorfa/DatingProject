/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.date.world.education;
import java.awt.Graphics;
import javax.swing.JComponent;
 
// Наследуемся от стандартного класса, который
// используется для создания компонентов на форме
public class OvalComponent extends JComponent
{
 
    // Переопределяем метод рисованиая, в который передается
    // объект класса Graphics
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Используем Graphics для рисования овала
        // с отступами
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
 
}