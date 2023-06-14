package ifStatement;

import java.util.Scanner;

public class elseIfPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number?");
        int number = input.nextInt();
        if(number > 0){
            System.out.println("entered number is positive");

        }else if(number <0){
            System.out.println("entered number is negative");
        }else {
            System.out.println("entered number is 0");
        }
    }
}
