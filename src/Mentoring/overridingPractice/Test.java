package Mentoring.overridingPractice;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        Dog b = new Beagle();
        b.speak();
    }
}
