package Mentoring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListPractice2 {
    /*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
    public static ArrayList<Integer> lessThan100(ArrayList<Integer> list){
        for (int i = list.size()-1;i>=0;i--){
            if (list.get(i)>100){
                list.remove(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(200);
        list.add(100);
        list.add(30);
        list.add(1200);
        list.add(1290);
        list.add(1);

        System.out.println(list);
        System.out.println(lessThan100(list));
    }
}
