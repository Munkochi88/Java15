package oop.abstraction.abstraction2;

import java.awt.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // you cannot create an object from interface
        //CanSwim canSwim = new CanSwim();

        Bird bird = new Bird();
        bird.eat();

        System.out.println(bird.TAIL);
        System.out.println(CanFly.WING);

        Dolphin dolphin = new Dolphin();
        dolphin.swim(3);
        System.out.println(dolphin.FIN);
        System.out.println(CanSwim.FIN);

        // is there any other way that I can still create a Dolphin object

        CanSwim dolphin2 = new Dolphin();
        dolphin2.swim(4);

        Duck duck = new Duck();
        duck.fly();
        duck.landing(50);
        duck.swim(50);

        // is there any other way that I can still create a Dolphin object

        CanSwim duck1 = new Duck();
        CanFly duck2 = new Duck();
        duck1.swim(7);
        duck2.fly();

        System.out.println("============");
        Duck duck3 = new Duck();
        duck3.run();
        duck3.printInfo();

    }
}
