package Loops;

import java.util.Scanner;

public class WhilePractice6 {
    public static void main(String[] args) {
        /*
        print out every letter from given string
        by separating them with dash
        dash --> d-a-s-h
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any string");
        String input = scanner.nextLine();
        int number = 0;
        while (number<=input.length()-1) {

            //System.out.print(input.charAt(number)+"-");
            if (number != input.length() - 1) {
                System.out.print(input.charAt(number) + "-");
            }else{
                System.out.print(input.charAt(number));
            }
                number++;
        }


    }
}
