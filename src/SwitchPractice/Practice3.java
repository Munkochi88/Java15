package SwitchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite fruit?");
        String fruit = scanner.nextLine().toLowerCase();


        switch (fruit){
            case "strawberry":

            case "mango":

            case "apple":

            case "grape":

            case "banana":
                System.out.println("we have your favorite fruit "+ fruit);
                break;
            default:
                System.out.println("Sorry! we don't have " + fruit);
                break;
        }
    }
}
