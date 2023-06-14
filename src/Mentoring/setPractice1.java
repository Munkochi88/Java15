package Mentoring;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

public class setPractice1 {
    public static void main(String[] args) {
        // Write a Java program to convert a hash set to an array.

        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("hi");
        set.add("bye");
        set.add("good bye");

        String[] arr = new String[set.size()];
        set.toArray(arr);


        System.out.println(Arrays.toString(arr));
    }


}
