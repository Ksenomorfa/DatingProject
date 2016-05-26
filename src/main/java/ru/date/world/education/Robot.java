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
public class Robot {

    //Текущая координата Х
    private double x = 0;
    //Текущая координата Y
    private double y = 0;
    //Текущий курс в градусах
    protected double course = 0;

    private String name;
    
    public Robot(String name) {
        this.name=name;
    }
    
    @Override
    public String toString(){
        return "name="+name;
    }
    
    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

    public void forward(int distance) {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}
