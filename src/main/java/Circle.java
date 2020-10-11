/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class Circle {
// Define Fields
    private double radius;
    private final double PI = 3.14159;
// Define Constructors
    public Circle(double radius){
        this.radius = radius; 
    }
    public Circle() {
        this.radius = 0.0;
    }
// Define Mutator and Accessor Methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
// Define Area, Diameter, Circumference 
    public double getArea (double radius) {
        return PI * this.radius * this.radius; 
    }
    public double getDiameter (double radius) {
        return this.radius * 2;
    }
    public double getCircumference (double radius) {
        return 2 * PI * this.radius; 
    }
}
