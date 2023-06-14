package GroupProject3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Roller coaster
Write a program that determines if the user can ride a roller coaster.
To ride the roller coaster, you must be at least 120 cm tall. You must also
be at least 9 years old.
If you under 18 years old your ticket cost 7$ if you older 18 your ticket
cost 12$.
Ask the user how tall and how old they are. Use a nested if statement to
determine if they can ride the roller coaster.
If they can, print "Welcome aboard." and Ticket price
If they cannot, print "Sorry, you are not eligible to ride, you have to be at
least 120 cm ".
If they cannot, print "Sorry, you are not eligible to ride you are too young
".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height?");
        int height = scanner.nextInt();
        if (height>= 120){
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            if (age >=9){
                System.out.println("Welcome aboard, your ticket cost is $7");
            }else if (age >19){
                System.out.println("Welcome aboard, your ticket cost is $12");
            }else{
                System.out.println("Sorry, you are not eligible to ride you are too young.");
            }

        }else{
            System.out.println("Sorry, you are not eligible to ride, You have to be at least 120cm.");
        }
    }
}
