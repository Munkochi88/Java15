package Loops;

import java.util.Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {
        String[] flowers = {"rose", "daisy", "sunflower"};
        for (String flower : flowers){
            System.out.println(flower.toUpperCase());
            System.out.println(flower);
        }
        String[] cities = {"Chicago", "New York", "Miami", "Tokyo", "Doha", "Denver"};
        // chicago@gmail.com
        // put those e-mail address in another storage for future reference
        String[] emailaddress = new String[cities.length];
        int i = 0;
        for (String city: cities){
            emailaddress[i] = city.toLowerCase().replace(" ", "").concat("@gmail.com");
            i++;
        }System.out.println(Arrays.toString(emailaddress));
    }
}
