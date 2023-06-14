package ArrayList;

/*
Create a Computer class under Arraylist package
-have instance fields of:
	brand, price, color, screenSize
-create one constructor to initialize all instance variables
Create a Test class
-store 4 computer objects an arraylist
-show properties of each computer from the list
 */

import java.util.ArrayList;

public class Computer {
    public String brand;
    public double price;
    public String color;
    public double screenSize;

    public Computer(String brand, double price, String color, double screenSize) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Brand: " + brand + " Price: " + price + " Color: " + color + " Screensize: " + screenSize;
    }
}
