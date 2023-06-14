package GroupProject4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Using a scanner enter a sentence that is not separated by space and each word
        starts with upper case. Print given String as separated words with spaces.
        Example:
        Given Value: "IWantToLearnJava"
        Output: I Want To Learn Java
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence that is not separated by space and each word\n" +
                "        starts with upper case.");
        String str = scanner.nextLine();

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 'A' && str.charAt(i) < 'Z') {// true
                newStr+=" ";

            }
            newStr += str.charAt(i);
        }
        System.out.println(newStr.trim());
    }
}
