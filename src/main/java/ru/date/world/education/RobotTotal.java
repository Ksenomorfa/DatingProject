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
public class RobotTotal extends Robot {
    private double totalDistance;    
    
    // перегруженный конструктор
    public RobotTotal() {
        super(0, 0);
    }
    
    public RobotTotal(double x,double y) {
            super(x,y);
    }
    
    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance +=distance;
        System.out.println("RobotTotal");
    }
    
    public double getTotalDistance() {
        return totalDistance;
    }
}
