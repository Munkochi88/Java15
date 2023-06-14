package Loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        and create a multiplication table for given number for up to 10s
        6>>> 6*1=6
             6*2=12
             ...
             6*10=60
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any positive number");
        int input = scanner.nextInt();
        int multi = 1;
        while (multi<=10){
            System.out.println(input + " * "+ multi +" = "+input*multi);
            multi++;
        }
    }
}
