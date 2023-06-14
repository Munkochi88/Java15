package GroupProject2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence with only three words");
        String sentence = sc.nextLine();

        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ",firstSpace+1);

        System.out.println(firstSpace-1 +" index number of " + sentence.charAt(firstSpace - 1));
        System.out.println(secondSpace-1 + " index number of " + sentence.charAt(secondSpace - 1 ));
        System.out.println(sentence.length()-1 +  " index number of " + sentence.charAt(sentence.length()-1));
    }
}