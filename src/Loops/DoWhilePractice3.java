package Loops;

import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        for that given number, create a star tree like following
        --> user enters--> 5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number!");
        int input = scanner.nextInt();
        String star = "*";

        do{
            System.out.println(star);
            star = star.concat("*");
            input--;

        }while(0<input);

    }
}
