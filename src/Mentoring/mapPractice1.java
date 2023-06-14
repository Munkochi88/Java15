package Mentoring;

import java.util.ArrayList;
import java.util.TreeMap;

public class mapPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(list);
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer i : list){
            if (!map.containsKey(i+"")){
                map.put(i+"",i);
                newList.add(i);
            }
        }
        System.out.println(newList);
    }

}
