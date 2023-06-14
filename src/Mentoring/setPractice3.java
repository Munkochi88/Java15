package Mentoring;

import java.util.HashSet;

public class setPractice3 {
    // Write a Java program to test a hash set is empty or not.

    public static boolean isEmpty(HashSet set){

        System.out.println(set.isEmpty());
        return false;
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        isEmpty(set);
    }
}
