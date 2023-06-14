package ArrayList;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        /*
        create and arrayList to store 5 city names
        implement a logic to print only city names that have 4 or more letters
         */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("chicago");
        cities.add("NY");
        cities.add("LA");
        cities.add("DesPlaines");
        cities.add("zion");

        for (String city : cities){
            if (city.length()>=4){
                System.out.println(city);
            }
        }

        System.out.println("---------------");

        for (int i = 0;i< cities.size();i++){
            if (cities.get(i).length()>=4){
                System.out.println(cities.get(i));
            }
        }





    }
}
