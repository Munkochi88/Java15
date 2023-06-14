package Loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        /*
        get to positive integer numbers from user and find sum of the range
        2,7 --> 3+4+5+6=18
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 2 positive integer numbers");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        input1++;
        int sum = 0;
        do {
            sum = sum + input1;
            input1++;
        }while(input1<input2);
        System.out.println(sum);
    }
}
