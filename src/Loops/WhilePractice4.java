package Loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        you/use have $100 given
        ask user how much is the spending amount
        -if the spending amount is less than balance keep asking user and let him/her spend more
        -if the spending amount is greater than balance, tell the user that you don't have enough money to spend!
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("I have $100 to spend. How much do you want to spend?");
        int amount = scanner.nextInt();
        int money = 100;
        while(money >0) {
            money = money - amount;
            if(money>0){
                System.out.println("your balance is " + money+ ". How much do you want to spend?");
                amount = scanner.nextInt();
            }else{
                System.out.println("You don't have enough money");
            }
        }
    }

}


