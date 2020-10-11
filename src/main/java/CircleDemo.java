
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class CircleDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the radius of your circle: ");
        double myRadius = keyboard.nextDouble(); 
        Circle myCircle = new Circle(myRadius); 
        System.out.println("The area of your circle is: " + myCircle.getArea(myRadius));
        System.out.println("The diameter of your circle is: " + myCircle.getDiameter(myRadius));
        System.out.println("The circumference of your cirlce is: " + myCircle.getCircumference(myRadius));
    }         

}
