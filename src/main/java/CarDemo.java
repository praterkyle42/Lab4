/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class CarDemo {
    public static void main(String[] args) {
        Car KiaForte = new Car(2014, "Kia");
        System.out.println("Accelerating:");
        for (int i = 1; i <= 5; i++) {
            KiaForte.Accelerate();
            System.out.println("Current Speed: " + KiaForte.getSpeed()); 
            }
        System.out.println("Braking:");
        for (int i = 1; i <=5; i++) {
            KiaForte.Brake(); 
            System.out.println("Current Speed: " + KiaForte.getSpeed());
            }
        }
}
