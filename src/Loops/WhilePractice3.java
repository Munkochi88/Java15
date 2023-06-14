package Loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divisors = 1;
        while (number>=divisors){
            if (number % divisors==0) {
                System.out.println(divisors);
            }
            divisors++;
        }
    }
}
