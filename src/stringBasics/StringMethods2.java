package stringBasics;

import java.util.jar.JarOutputStream;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "phone";
        System.out.println(str.charAt(4)); //e
        //System.out.println(str.charAt(5)); // StringIndexOutOfBoundsException
        //System.out.println(str.charAt(-3)); // StringIndexOutOfBoundsException
        //System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length()-2)); // n

        // indexOf();
        System.out.println(str.indexOf('p')); // 0
        System.out.println(str.indexOf("p")); // 0
        System.out.println(str.indexOf("ph")); // if given chars will match with within the string
                                                // in the same order sequence, it will return first
                                                // matching char's index number
        System.out.println(str.indexOf("ne"));
        System.out.println(str.indexOf("nE")); // -1 (not matching "E")
        str = "New York";
        //index number of space
        System.out.println(str.indexOf(' ')); // 3
        str = "mama";
        // find index of second 'a'
        System.out.println(str.indexOf('a',2));
        str = "happy evening to you";
        System.out.println(str.indexOf('y')); // 4
        // find second 'y'
        System.out.println(str.indexOf('y', 5));
        // how to pass index 5 above by dynamically?
        int indexOfSecondY = str.indexOf('y', str.indexOf('y')+1);
        System.out.println(indexOfSecondY);
        String word = "Java is getting easy";
        System.out.println(word.indexOf(' ', word.indexOf(' ')+1));
        System.out.println(word.indexOf("Java is getting easy"));

        String text = "DO whatever it Takes";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());




    }
}
