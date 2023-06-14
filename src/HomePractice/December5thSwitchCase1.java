package HomePractice;

import java.util.Scanner;

public class December5thSwitchCase1 {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");
        Scanner scanner = new Scanner (System.in);
        int age = scanner.nextInt();

        switch (age) {
            case 1 :
                System.out.println("Now you are walking");
                break;
            case 2 :
                System.out.println("Now you are talking");
                break;
            case 3 :
                System.out.println("now you are at your fun age");
                break;
            default:
                System.out.println("I don't know how old you are");
                break;

        }
    }
}
