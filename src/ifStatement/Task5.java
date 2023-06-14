package ifStatement;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        taks:
        there are 3 tests for class
        -to get a letter score for averages
        -use the following scale
        90-100 ->A
        80-89 ->B
        70-79 ->C
        60-69 ->D
        less than 60 -> please come again
         */
        System.out.println("Please enter result of your 3 tests");
        Scanner input = new Scanner(System.in);
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();

        if ((score1+score2+score3)/3>=90){
            System.out.println("your average of test is A");
        }
        else if ((score1+score2+score3)/3<90 && (score1+score2+score3)/3>79){
            System.out.println("your average of test is B");
        }
        else if ((score1+score2+score3)/3<80 && (score1+score2+score3)/3>69){
            System.out.println("your average of test is C");
        }
        else if ((score1+score2+score3)/3<70 && (score1+score2+score3)/3>=60){
            System.out.println("your average of test is D");
        }
        else{
            System.out.println("Please come again");
        }

    }
}
