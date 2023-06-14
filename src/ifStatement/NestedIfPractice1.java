package ifStatement;

public class NestedIfPractice1 {
    public static void main(String[] args) {
        /*
        Travel:
        id
        visa
        ticket
        check id -> check visa -> check ticket
         */
        boolean id = true, visa = true, ticket = true;
        System.out.println("Checking id now...");

        if (id){
            System.out.println("Checking visa now...");

            if (visa){
                System.out.println("Checking ticket now...");

                if (ticket){
                    System.out.println("Have a nice travel!");

               }else{
                    System.out.println("you need to buy your ticket");
                }
            }else{
                System.out.println("you should have VISA");
            }
        }else {
            System.out.println("First, you should have valid id");
        }
    }
}
