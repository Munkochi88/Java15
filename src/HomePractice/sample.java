package HomePractice;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        /*
        TASK: get a string from User via scanner and:
        -print:
        - first char
        - last char
        - index of second matching letter 'c'
                - lenght of string
        - index of x
        - middle char

         */
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
        System.out.println(text.length());
        System.out.println(text.charAt(text.length()/2));

    }
}
