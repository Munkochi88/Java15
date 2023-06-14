package oop.inheritance4;

public class Notebook extends Book{
    //int pageCount;
    public Notebook(){
        super(500,"Legends","History");
    }

// static methods cannot be overridden
    public static void read(){
        System.out.println("Notebook Read");
    }

}
