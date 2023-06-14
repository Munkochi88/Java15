package Mentoring;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class sample {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        HashMap <Character,Integer> map = new HashMap<>();
        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        System.out.println(map);
        System.out.println(map.get('A'));
    }
}
