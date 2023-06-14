package Mentoring;

import java.util.ArrayList;

public class ArrayListPractice3 {
    public static ArrayList<Integer> reversing(ArrayList<Integer> list){
        ArrayList<Integer> reversed = new ArrayList<>();
        reversed.add(list.get(0));
        for (int i = 1;i< list.size();i++){
            reversed.add(list.get(list.size()-i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(reversing(list));
    }
}
