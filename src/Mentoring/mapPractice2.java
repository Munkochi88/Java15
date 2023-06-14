package Mentoring;

import java.util.HashMap;
import java.util.Map;

public class mapPractice2 {

        /*
        INPUT:
        aa222bbbbYYYY6666
        OUTPUT:
        a:2
        2:3
        b:4
        Y:4
        6:4
         */


    public static void countOCC(String str){
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            String str1 =""+str.charAt(i);
            if (map.containsKey(str1)){
                map.put(""+str1, map.get(str1)+1);
            }else{
                map.put(str1,1);
            }
        }
        System.out.println(map);
    }

    public static void countOCC1(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char letter : s.toCharArray()) {
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                map.put(letter, map.get(letter) + 1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "aa222bbbbYYYY6666";
        countOCC(str);
        countOCC1(str);

        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int value1 = 0;
        for (int i = 0; i< chars.length;i++){
            if (!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else{
                map.put(chars[i], map.get(chars[i])+1);
            }
        }System.out.println(map);

    }

}
