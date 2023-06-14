package RecapWithAhmet;

public class StaticExample {
    public static int money=10000;
    public int weight = 210;
    public static void speak(){
        System.out.println("Ahmet is speaking");
    }
    public void run(){
        System.out.println("Ahmet is running");
    }
    public void withdrawMoney(){
        money-=200;
        System.out.println("Good job you are getting younger");
    }
    static {
        /*
        No matter what this will execute first
         */
        System.out.println("Hey I am a" +
                "static block" +
                "Please let me go first");
    }
    {
        //this will come after static block
        System.out.println("Hey I am a instance block");
    }
}
