package SwitchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("It is IT department");
                break;
            case 2:
                System.out.println("It is HR department");
                break;
            case 3:
                System.out.println("It is Help desk");
                break;
            case 4:
                System.out.println("It is Accounting department");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
