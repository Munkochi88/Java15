package object;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1);
        System.out.println(animal1.name);
        System.out.println(animal1.color);
        System.out.println(animal1.age);
        animal1.name = "Simba";
        System.out.println(animal1.name);
        animal1.color = "Brown";
        System.out.println(animal1.color);
        animal1.age = 2;
        System.out.println(animal1.age);

        // create another object, innitialize all instance variables by using object
        // print out those new values

        Animal animal2 = new Animal();
        animal2.name = "Scar";
        System.out.println(animal2.name);
        animal2.color = "Black";
        System.out.println(animal2.color);
        animal2.age = 1;
        System.out.println(animal2.age);

        System.out.println(animal1.gender);
        System.out.println(animal2.gender);
        animal2.gender = "Male";
        System.out.println(animal2.gender);
        System.out.println("===================");
        animal2.eat();
        animal1.eat();

        // create a method that will print out all properties of every animal
        animal2.all();
        animal1.all();
        Animal dog = new Animal();
        System.out.println(dog.energyLevel);
        dog.eat();
        // create run method
        // when an animal rums
        // it will ise 20% of energy
        // implement the logic and show leftover energy
        // include name of the animal in the method to let user know who is running
        dog.run();
        animal2.run();
        animal1.run();
        Shape helper = new Shape();
        helper.perimeterCalculator(12,17);

        // I want to have a random number so that I can add 1000 to it in this class

        Student student = new Student();
        int number = student.hourCreator();
        System.out.println(number + 1000);
    }
}
