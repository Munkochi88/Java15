package Mentoring;

import java.util.HashMap;
import java.util.Map;

public class mapPractice4 {
    public static void main(String[] args) {
Map<String,String> map=new HashMap<>();
    String[] strings ={"salt","tea","soda","toast"};
    for(int i=0;i<strings.length;i++){
        for (int k=i+1;k< strings.length;k++){
            if(strings[i].startsWith(""+strings[k].charAt(0))){
                map.put(""+strings[i].charAt(0),strings[i]+strings[k]);
            }
        }
    }
        System.out.println(map);
    }
}
