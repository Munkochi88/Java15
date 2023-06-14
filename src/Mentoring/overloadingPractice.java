package Mentoring;

public class overloadingPractice {
    /*
    Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.
    public class Test1
    {
    public static void talk()
    {
          System.out.println(“hello there!“);
    }
    public static // FINISH THE METHOD HERE //
    public static void main(String[] args)
    {
          talk(“Matthew”);
    }
}
     */
    public static void talk()
    {
        System.out.println("hello there!");
    }
    public static void talk(String name){
        System.out.println("hello "+name);
    }
    public static void main(String[] args)
    {
        talk();
        talk("Tom");
    }
}

