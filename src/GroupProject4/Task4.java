package GroupProject4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one in number between 1 and 10 then, Write the
        program to print the string in the following format:
        Example:
        Input: 6
        Output:
        666666
        55555
        4444
        333
        22
        1
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one number between 1 to 10");
        int input = scanner.nextInt();
        String tree = "";
        if (input>0 & input<10) {

            for (int i = input; i>0; i--){
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
