/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdpra
 */
public class Car {
 //define fields 
    private int yearModel; 
    private String Make; 
    private int Speed; 
 //Define Constructors 
    public Car (int yearModel, String Make){
        this.yearModel = yearModel; 
        this.Make = Make; 
        this.Speed = 0; 
        
    }
// Define Accessors 
    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return Make;
    }

    public int getSpeed() {
        return Speed;
    }
//Create Accelerate and Brake Methods
    public int Accelerate (){
        Speed+= 5; 
        return Speed;
    }
    public int Brake () {
        Speed -= 5; 
        return Speed;
    }
}
