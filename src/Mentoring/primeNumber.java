package Mentoring;

import java.util.Scanner;

public class primeNumber {
    public static void primeNumber(int number){

        int counter = 0;
        for (int i=1;i<=number;i++){
            if (number%i==0&&number%number==0){
                counter++;
            }
        }
if (counter==2){
    System.out.println("It is prime number");
}else {
    System.out.println("Not prime number");
}
    }

    public static void main(String[] args) {
        primeNumber(9);
    }
}
