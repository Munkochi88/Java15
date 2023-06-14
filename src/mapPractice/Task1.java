package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
    Map<String, Integer> data1 = new HashMap<>();
        data1.put("A", 1);
        data1.put("B", 26);
        data1.put("C", 30);
        data1.put("D", 5);
        List<Integer> list1 = largeNumberFinder(data1);
        System.out.println(list1);
    }
    /*
    create a method that will get a map as parameter
    given map as parameter should be Map<String, Integer>
    this method will find all values from the given Map
    this method will return aif the value is greater than 25
    this method returns those greater number as a list
     */
    public static List<Integer> largeNumberFinder(Map<String, Integer> map){
        List<Integer> numbers = new ArrayList<>();
        for (Integer number: map.values()){
            if (number>25){
                numbers.add(number);
            }
        }
        return numbers;
    }
    public Map<String, String> fihrstChar(String[] strings) {
        Map<String,String> map = new HashMap();
        for(int i = 0; i<strings.length;i++){
            for(int k=i+1;k<strings.length;k++){
               if (strings[i].charAt(0)==strings[k].charAt(0)){
                   map.put(""+strings[i].charAt(0),strings[i]+strings[k]);
               }
            }

        }return map;
    }
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String> ();
        for (String s:strings) {
            if (!map.containsKey(s.substring(0,1))) {  // first time we've seen this string
                map.put(s.substring(0,1), s);

            }
            else
            {
                String existing = map.get(s.substring(0,1));
                map.put(s.substring(0,1), existing+s);
            }

        }
        return map;
    }
}
