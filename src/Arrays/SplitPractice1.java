package Arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String str1 = "Selenium";
        String[] parts = str1.split("n");
        System.out.println(Arrays.toString(parts));

        // csv files
        //today is saturday

        String str2 = "It is a good day to practice Java. It is snowing outside.";
        // store every word in an array
        str2 = str2.replace(".","");
        String[] parts2 = str2.split(" ");
        System.out.println(Arrays.toString(parts2));
        String[] item = {"It", "is", "a", "good", "day", "to", "practice", "Java", "It", "is", "snowing", "outside"};

    }
}
