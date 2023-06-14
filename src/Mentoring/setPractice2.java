package Mentoring;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class setPractice2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        Set set = new TreeSet<>();
        Set set1 = new TreeSet<>(list);
        //System.out.println(set);
        for (Object a: list ){
            set.add(a);
        }
        System.out.println(set);
    }
}
