package stringBasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "water";
// startsWith(); return boolean
        boolean result1 = str.startsWith("w");
        System.out.println(result1); //true
        System.out.println(str.startsWith("water")); //true
        System.out.println(str.startsWith("ter")); //false
// endsWith(); return boolean
        System.out.println(str.endsWith("r")); //true
        System.out.println(str.endsWith("abc")); //false

        /*
        TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- length of string
	- index of x
	- middle char
         */

        System.out.println("Please enter a String value");
        String userInput = scanner.nextLine();
        System.out.println(userInput.charAt(0));
        System.out.println(userInput.charAt(userInput.length()-1));
        System.out.println(userInput.indexOf('c', userInput.indexOf('c')+1));
        System.out.println(userInput.length());
        System.out.println(userInput.indexOf('x'));
        System.out.println(userInput.charAt(userInput.length()/2));

// contains(); --> boolean
        str = "water";
        boolean b = str.contains("w");
        boolean b1 = str.contains("ter");
        System.out.println(b); //true
        System.out.println(b1); //true
        System.out.println(str.contains("ta")); //false
        System.out.println(str.startsWith("wat") != str.contains("ter")); //false

// equals(); --> boolean
        System.out.println(str.equals("Water")); //false
        System.out.println(str.equals("WATER")); //false
        System.out.println(str.equals("water")); //true

// equalsIgnoreCase(); --> boolean
        System.out.println(str.equalsIgnoreCase("WaTeR")); //true
        System.out.println(str.equals("ater")); //false

// substring();
    }
}
