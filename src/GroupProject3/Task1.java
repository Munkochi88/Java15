package GroupProject3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Please input second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Please input third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println(secondNumber);
        }else {
            System.out.println(thirdNumber);
        }

    }
}
