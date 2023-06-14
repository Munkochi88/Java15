package object;

public class CatTest {
    public static void main(String[] args) {
       Cat tom = new Cat();
        System.out.println(tom.name);
       tom.name = "Tom";
       tom.age = 3;
       tom.color = "Black";
        System.out.println(tom.foodAmount);
        tom.foodAmount = 40;
        System.out.println(tom.foodAmount);
       tom.sleep();
       Cat cat2 = new Cat();
       cat2.sleep(); // null is sleeping
       tom.run();
        System.out.println(tom.run());
        int number = tom.run();
        System.out.println(number);

        // however many miles tom runs, give him 500 dollar per mile
        System.out.println((tom.run()*500));
        String message1 = tom.walk("west");
        System.out.println(message1);
        // Method with void return types cannot be called in sout
       // System.out.println(tom.sleep());

        tom.setColor("Blue");
        System.out.println(tom.color);
        System.out.println(cat2.color);
        tom.getColor();
        System.out.println(tom.getColor());
        String info = tom.properties();
        System.out.println(info);

        tom.setAge(12);
        tom.getAge();
        System.out.println("In 10 years your age will be "+ (tom.getAge()+10));
    }
}
