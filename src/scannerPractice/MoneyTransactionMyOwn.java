package scannerPractice;

import java.util.Scanner;

public class MoneyTransactionMyOwn {
    public static void main(String[] args) {
        Scanner David = new Scanner(System.in);
        /*
        David wants to deposit his money into his bank account
        -he already got $200 in his account
        -he got three different paychecks ($480, $600 and $350)
        -he can only deposit one paycheck at a time
        -after he got his money in the account
        - he bought a phone for $599 and headphone for $299
        - calculat his final money in his account
         */

        int currentBalance = 200;
        int paycheck1 = 480;
        int paycheck2 = 600;
        int paycheck3 = 350;
        int phone = 599;
        int headphone = 299;
        int afterFirstPayCheck = currentBalance + paycheck1;
        int afterSecondPayCheck = currentBalance + paycheck2;
        int afterThirdPayCheck = currentBalance + paycheck3;

        System.out.println("Please deposit first paycheck");
        int afterFirstPaycheck = David.nextInt();
        System.out.println(afterFirstPaycheck);
        System.out.println("Please deposit second paycheck");
        int afterSecondPaycheck = David.nextInt();
        System.out.println(afterSecondPaycheck);
        System.out.println("Please deposit third paycheck");
        int afterthirdPaycheck = David.nextInt();
        System.out.println(afterThirdPayCheck);




    }
}
