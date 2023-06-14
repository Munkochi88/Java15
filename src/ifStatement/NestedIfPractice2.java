package ifStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        /*
        ask name of the city
        if the city is chicago if yes ask what is school
        if school is techtorial say you are lucky to have EFE
        if school is not techtorial say please come chicago and visit us!
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your city?");
        String city = input.nextLine();

        if (city.equalsIgnoreCase("chicago")){
            System.out.println("what is your school name?");
            String school = input.nextLine();

            if(school.equalsIgnoreCase("Techtorial")){
                System.out.println("you are lucky to have EFE!");
            }else{
                System.out.println("Please come and visit!");
            }
        }
        else if (city.equalsIgnoreCase("miami")){
            System.out.println("you should be attending miami campus!");
            System.out.println("what is your school name?");
            String school = input.nextLine();

            if(school.equalsIgnoreCase("Techtorial")){
                System.out.println("you are lucky to have EFE!");
            }else{
                System.out.println("Please come and visit!");
            }
        }
        else{
            System.out.println("Please come to chicago and visit");
        }
    }
}
