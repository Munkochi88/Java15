package scannerPractice;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 200;

        System.out.println("please enter first deposit amount");
        double firstCheck = scanner.nextDouble();
        balance = balance + firstCheck; // >> balance += firstCheck;

        System.out.println("please enter second deposit amount");
        double secondCheck = scanner.nextDouble();
        balance += secondCheck;

        System.out.println("Your balance after deposit is: "+balance);

        System.out.println("please enter third deposit amount");
        double thirdCheck = scanner.nextDouble();
        balance += thirdCheck;

        System.out.println("Your balance after deposit is; "+balance);

        System.out.println("Please enter phone price");
        double phone$ = scanner.nextDouble();
        balance -=phone$;

        System.out.println("Please enter headphone price");
        double headphone$ = scanner.nextDouble();
        balance -=headphone$;

        System.out.println("After buying some items your balance is "+balance);



    }
}
