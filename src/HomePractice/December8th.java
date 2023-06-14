package HomePractice;

import java.util.Scanner;

public class December8th {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I have $100 to spend. How much is it?");
        int amount = 9;
        int money = 100;

        while (money >=0) {
            money = money - 9;
            if (money>=0){
                System.out.println("your balance is " + money);
                amount = scanner.nextInt();

            }else {
                System.out.println("You don't have enough money now");
            }

        }
    }
}
