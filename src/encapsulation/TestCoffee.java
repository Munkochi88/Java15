package encapsulation;

public class TestCoffee {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setKind("Black");
        System.out.println("This coffee is "+coffee.getKind());
        coffee.setPrice(4.59);
        System.out.println("This coffee costs $"+coffee.getPrice());
        coffee.setSize("Large");
        System.out.println(coffee.getSize()+" Coffee");
    }
}
