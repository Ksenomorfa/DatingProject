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
import java.awt.Graphics;
import javax.swing.JComponent;
 
public class RectangleComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
}