package Mentoring;

import java.util.ArrayList;
import java.util.List;

public class doubling {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        List<Integer> doubling = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        for (int num:list){
            doubling.add(num*2);
        }
        System.out.println(doubling);

    }
}
