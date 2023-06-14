package oop.inheritance3;

public class Vehicle {
    /*

-Vehicle
  Variables:
    protected  model;
    default year;
    public brand;
  Methods:
    move(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return <OneOfObject-Vehhicle_Car>
  Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
  variables:
    model;
    engineType;
  Methods:
    Override move(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
     */
    protected String model;
    int year;
    public String brand;

    public void move(){
        System.out.println("Vehicle is moving");
    }
    public boolean stop(){
        System.out.println("Vehicle is stopping");
        return true;
    }
    protected boolean start(){
        System.out.println("Vehicle is starting");
        return true;
    }
    Object accelerate(){
        System.out.println("Vehicle accelerates");
        return 3;
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}
