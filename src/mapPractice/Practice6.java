package mapPractice;

import java.util.*;

public class Practice6 {
    public static void main(String[] args) {
        HashMap<String, Integer> department = new HashMap<>();
        department.put("IT",204);
        department.put("HR",305);
        department.put("ADMIN",102);

        // KeySet() --> returning all keys as set
        // values() --> returning all values as Collection

        System.out.println(department.keySet());
        System.out.println(department.values());
        System.out.println(department);

        // entrySet() --> will return keys and values as pair

        System.out.println(department.entrySet());
        Set<Map.Entry<String, Integer>> pairs = department.entrySet();

        // reach out key-value pairs individually
        for (Map.Entry<String ,Integer> pair: pairs){
            System.out.println(pair);
            System.out.println("--> "+pair.getKey());
            System.out.println("$$> "+pair.getValue());
        }

    }
}
