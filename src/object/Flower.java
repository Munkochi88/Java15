package object;

public class Flower {
    String type;
    double price;
    String color;

    public void sell(){
        System.out.println("selling a flower");
    }
    public Flower(){
        System.out.println("No argument constructor");
    }
public Flower(String type){
        this.type = type;
    System.out.println("One argument Constructor");
}
public Flower(String type, String color){
        this.type = type;
        this.color = color;
    System.out.println("Two argument Constructor");
}
}
