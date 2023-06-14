package GroupProject4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Reverse a given String and print it, if they have space in the
        beginning and at the end then remove it. Try doing with for
        loop or while loop.
        Example:  " Job" -> "boJ"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word!");
        String input=scanner.nextLine();
    String reversed = "";
    for (int i = input.length()-1; i>=0; i--){
        reversed+=input.charAt(i);

    }System.out.println(reversed);

    }
}
