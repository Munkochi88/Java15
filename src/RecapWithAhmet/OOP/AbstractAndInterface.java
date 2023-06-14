package RecapWithAhmet.OOP;

public class AbstractAndInterface {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is Abstract? and Can you clarify it with little details?
        -->Abstract is way to organize the methods with only NECESSARY information(template)
           you do not have body for Abstract methods. It means people can see the template of
           the method and "OVERRIDE" this based on their requirements.

         NOTE: We do not have a body for abstract methods because every class extends to the
               abstract class can MAKE THEIR OWN IMPLEMENTATION.

    2-Why do you need to have abstract class in your project?
        **>For many methods, we need developers to make their own implementation to reduce
           the amount of duplication in the project which cause memory slowness, system slowness,
           more execution for system.

    3-Where do you use Abstract Class in your project?
        -->I would definitely say that I use general OOPS concept in everywhere of my project.
           In automation script I do not use too much, but I know that my team developers are using.

    4-Can you create an Object from Abstract Class? If no, How are you going to
      access all the methods and variables from that class
        -->No, you can not create an object from Abstract class.
        TO BE ABLE TO ACCESS THESE METHODS AND VARIABLES YOU NEED TO OVERRIDE THEM.
        (Extends from parent to child)

    5-Can you have normal and abstract method inside abstract class?
        -->Yes, you can have both of the method types inside of Abstract class

    INTERFACE:

    1- What is interface?
        --> Interface is a blueprint of the object like class which has special method that can
            be overridden to make new implementation in subclass.
        --> We use "IMPLEMENTS" keyword to make the class connected with INTERFACE

    2- Why do you need interface if you have abstract?
        BECAUSE INTERFACE HAVE MORE FEATURES IN TERMS OF ACCESSING THE MULTIPLE PARENTS AT THE SAME
        TIME BY OVERRIDING.

    3-What is the difference between interface and abstract? (***THE MOST COMMON***)
        INTERFACE:
        1-Interface is declared with "INTERFACE" keyword
        2-Interface can have only public abstract methods(Show off: default keyword-->exception)
        3-To make a connection, we use "IMPLEMENTS" keyword
     ***4-In Interface you can implement the class as many as you want parents and once you can use
          extends, but it should come before implement
        5-When you initialize a variable interface as default is it "FINAL STATIC"
        6-Methods must be as default "PUBLIC ABSTRACT"
        7-Interface can not have CONSTRUCTOR


        ABSTRACT:
        1-Abstract is declared with "ABSTRACT" keyword
        2-Abstract may or may not have regular methods
        3-To make a connection, we use "ABSTRACT" keyword
     ***4-In Abstract you can extend the class ONCE.(one extends keyword per class)
        5-When you declare a variable in abstract there is no default keyword.
        6-You can have any access modifier for this. (no default keyword)
        7-Can have CONSTRUCTOR

     */

}
