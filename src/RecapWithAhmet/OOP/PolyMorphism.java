package RecapWithAhmet.OOP;

public class PolyMorphism {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is polymorphism? (poly - many, morphism - forms)
        --> It is different form of Object.

    2-What is dynamic static polymorphism?
        *Dynamic Polymorphism: is all about OVERRIDING. -> Dynamic(action)
        *Static Polymorphism: ain all about OVERLOADING. -> Static(stable) -> no action

    3-What is difference between Overriding and Overloading? (*** THE MOST COMMON ***)
        OVERLOADING:
            1-Overloading needs to be in the SAME CLASS
            2-Overloading methods can have final, static, private
           *3-Whenever you overload, it checks METHOD SIGNATURE(DIFFERENT METHOD SIGNATURE)
                METHOD SIGNATURE ==> Name of the method + Parameter
                                 --> public void run(int speed)
                                 --> public void run(int speed, String name)

        OVERRIDING:
            1-Overriding needs to be in the DIFFERENT CLASS
            2-You cannot override final, static, private methods
            3-Whenever you override, It checks not only Method Signature also return type
                It must have SAME METHOD SIGNATURE

     */
    public void dismiss(int time,int minute,String nameOfTeacher){
        System.out.println("Students are leaving at "+time+minute+"with teacher"+nameOfTeacher);
    }

    public void dismiss(int hour,String nameOfTeacher){
        System.out.println("Students are leaving at "+hour+"with Teacher"+nameOfTeacher);
    }

    public void dismiss(String date,String nameOfTeacher){
        System.out.println("Hello");
    }
}
