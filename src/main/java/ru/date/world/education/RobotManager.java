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
public class RobotManager {

    public static void main(String[] args) {
        Robot robot = new RobotTotal(20,20);
        
        robot.forward(20);
        robot.printCoordinates();
        
        robot.setCourse(90);
        robot.forward(20);
        robot.printCoordinates();
        robot.setCourse(45);
        robot.forward(20);
        robot.printCoordinates();
        System.out.println(robot.getClass().getName());
        
        RobotExt robot2 = new RobotExt(20,20,60);
        robot2.forward(20);
        robot2.printCoordinates();
        robot2.setCourse(100);
        robot2.back(20);
        System.out.println(robot2.toString());
        
        Robot robot3 = new Robot("Name of Robot");
        System.out.println(robot3.toString());
    }
}
