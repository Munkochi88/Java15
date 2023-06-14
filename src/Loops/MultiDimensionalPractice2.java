package Loops;

import java.util.Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {
        String[][] citiesFromStates = {{"Los Angeles","Sacramento"}, {"Chicago", "Springfield", "Des Plaines"},
                {"Baltimore", "Rockville"}};
        // use for-each loop to show names of cities
        // print --> when you find Chicago --> "Chicago is in IL"

        for (String[] states:citiesFromStates){
            for (String city: states){

                if (city.equalsIgnoreCase("chicago")){
                    System.out.println(city+" is in IL");
                }else System.out.println(city);
            }
        }

        System.out.println(Arrays.deepToString(citiesFromStates));
    }
}
