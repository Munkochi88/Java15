package Mentoring;

import java.util.ArrayList;

public class ArrayListPractice1 {
    /*
    Write a method that takes an ArrayList<Integer> and an
    int value and returns the first index at which
    value appears in the ArrayList.
    If the value does not exist in the ArrayList, return -1
     */

    public static Integer firstIndex(ArrayList<Integer> num, int value){
        for (int i=0;i< num.size();i++)
            if (num.get(i)==value) {
                return i;
            }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        System.out.println(firstIndex(list,20));
    }
}
