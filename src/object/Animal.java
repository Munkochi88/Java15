package object;

public class Animal {
    // instance variable, instance variables defines/belong the object
    String name;
    String color;
    int age;
    int energyLevel;
    String gender = "Female";
    public void eat(){
        energyLevel = 100;
        System.out.println("Energy level is " +energyLevel+ " after eating");
        System.out.println(name + " is eating");
    }
    public void all(){
        System.out.println(name+" "+color+" "+age+" "+gender);
    }
    public void run() {
        energyLevel-=20;
        System.out.println("Energy level is " +energyLevel+ " after running");
        System.out.println(name + " is running");
    }

}
