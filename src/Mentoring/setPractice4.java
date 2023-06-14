package Mentoring;

import java.util.HashSet;

public class setPractice4 {
    // Write a Java program to clone a hash set to another hash set.
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(6);
        set.add(7);

        HashSet<Integer> newSet = new HashSet<>();
        newSet = (HashSet<Integer>) set.clone();
        HashSet<Integer> newSet1 = new HashSet<>(set);
        System.out.println(newSet);
        System.out.println(newSet1);
    }
}
