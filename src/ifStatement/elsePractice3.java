package ifStatement;

import java.util.Scanner;

public class elsePractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input your purchase amount:");
        double amount = input.nextInt();
        System.out.println("What is your state?");
        input.nextLine();
        String state = input.nextLine();
        double tax = 0, txTax = 0.045;
        if (state.equalsIgnoreCase("tx") || state.equalsIgnoreCase("texas")){
          tax = amount * txTax;
        }else{
            tax = amount *0.1;
        }
        if (amount >= 1000){
            System.out.println("your saving is "+ amount*0.20);
            System.out.println("Your total purchase amount after discount is " + ((amount = amount - amount*0.20) + tax ));
        }else{
            System.out.println("your saving is "+ amount*0.05);
            System.out.println("Your total purchase amount after discount is "+ ((amount= amount-amount*0.05) + tax));
        }
    }
}
