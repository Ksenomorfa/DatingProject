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
 
public class TriangleComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(5, getHeight() - 10, getWidth()/2 - 5, 5);
        g.drawLine(getWidth()/2 - 5, 5, getWidth() - 10, getHeight() - 10);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }
}