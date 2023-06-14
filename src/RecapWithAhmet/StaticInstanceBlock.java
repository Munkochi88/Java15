package RecapWithAhmet;

public class StaticInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is static as a keyword and why do you use it?
        -->Static(As a keyword) is a way to make the methods accessible
        "WITHOUT CREATING AND OBJECT" from that class.
        -->The disadvantage of using static keyword "YOU CANNOT OVERRIDE THE METHODS"
        SIDE NOTE: YOU CANNOT OVERRIDE "PRIVATE,STATIC,FINAL METHODS"

    2-What is static block?
        -->It is the block that can be called once (ONE TIME IT WORKS)
        -->It always executes FIRST

    3-What is static as a variable keyword?
        -->It makes variable belong to the class
        -->It is sharable(common) ==> common for all objects
        -->It can be accessed by other classes without creating an object. Just with
        the name of class.

    4-What is instance block?
        -->It is a block that can be called as many as you have objects.
     */
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        staticExample.run();
        StaticExample.speak();
        //To be able to call method. I can use just className(System suggested)
        //StaticExample.age=32;
        StaticExample ahmet = new StaticExample();
        System.out.println(ahmet.money);//10000
        ahmet.withdrawMoney();
        System.out.println(ahmet.money);//9800
        StaticExample mehmet=new StaticExample();
        mehmet.withdrawMoney();
        mehmet.withdrawMoney();
        System.out.println(mehmet.money);

        //3 Objects --> instance sout --> 3
        //3 Objects --> static sout --> 1
    }
}
