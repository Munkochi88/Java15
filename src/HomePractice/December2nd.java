package HomePractice;

import java.util.Scanner;

public class December2nd {
    public static void main(String[] args) {
        //make above task solution dynamic
        System.out.println("Please enter 3 words sepparated with a space");  // intro
        Scanner input = new Scanner(System.in);                              // add scanner
        String text = input.nextLine();                                      // we receive input as a 3 words

        int space1 = text.indexOf(" ");                                     // we find index of 1st SPACE
        int space2 = text.indexOf(" ", text.indexOf(" ")+1);    // we find index of 2nd SPACE
        String middleWord = text.substring(space1+1,space2);                // we find what is a MIDDLE (2nd) word

        System.out.println(middleWord);                                    //we print middle word from any input ( 3 words)
    }
}
