package GroupProject4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one number between 1 to 10 then, Write the
        program to print the string in the following format:
        Example:
        Input: 5
        Output:
        1
        22
        333
        4444
        55555
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one number between 1 to 10");
        int input = scanner.nextInt();
        String tree = "";
        if (input>0 & input<10) {
            for (int i = 0; i<=input; i++){
                for (int k = 0; k<i; k++){
                    tree = "" +i;
                    System.out.print(tree);
                }System.out.println(" ");
            }
        }else{
            System.out.println("Wrong input");
        }
    }
}
