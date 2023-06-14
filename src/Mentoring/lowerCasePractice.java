package Mentoring;

import java.util.ArrayList;
import java.util.List;

public class lowerCasePractice {
    public static void main(String[] args) {
        List<String> lower = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("Hello"); list.add("Hi"); list.add("AAA"); list.add("BBB");
        for (String str:list){
            lower.add(str.toLowerCase());
        }
        System.out.println(lower);
    }
}
