package HomePractice;

import java.util.Scanner;

public class December6thTask5 {
    public static void main(String[] args) {
        System.out.println("Please enter three ingredients with spaces:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Please enter any number:");
        int num = scanner.nextInt();
        int firstSpace = input.indexOf(" ");
        int secondSpace = input.indexOf(" ", firstSpace+1);

        String word1 = input.substring(0, firstSpace);
        String word2 = input.substring(firstSpace+1, secondSpace);
        String word3 = input.substring(secondSpace+1);



        System.out.println(
                (word1.replace(""+word1.charAt(0), ""+num++)) + " "
                + (word2.replace(""+word2.charAt(0), ""+num++)) + " "
                + (word3.replace(""+word3.charAt(0), ""+num)));




    }
}
