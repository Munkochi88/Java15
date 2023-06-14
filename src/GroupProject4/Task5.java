package GroupProject4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter one string value and print only
        unique letters combined as String also without any space in the
        beginning and at the end.
        Example -1 :
        Given Value: "i am happy"
        Output: i am hpy
         */
        Scanner scanner = new Scanner(System.in);
        String str = "i am happy";
        String empty = "";

        int count;
        char String[] = str.toCharArray();

        for (int i = 0; i< str.length(); i++){
            for (int k=0;k<str.length();k++){
                if (str.charAt(i)!=str.charAt(k)){
                    empty+=str.charAt(i);
                }
         }
        }System.out.println(empty);
        /*
        JAVA
        public class DuplicateCharacters {
        public static void main(String[] args) {
        String string1 = "Great responsibility";
        int count;
        //Converts given string into character array.
        char string[] = string1.toCharArray();
        System.out.println("Duplicate characters in a given string: ");
                     */
    }
}
