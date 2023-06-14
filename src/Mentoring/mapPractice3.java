package Mentoring;

import java.util.HashMap;
import java.util.Map;

public class mapPractice3 {
    public static HashMap<String,Integer> practice (HashMap<String,Integer> m){
        if (m.containsKey("a")){
            m.put("b",m.get("a"));
            m.remove("c");
        }
        return m;
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        System.out.println(map);
        System.out.println(practice(map));
    }
}
