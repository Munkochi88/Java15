package scannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How is the weather this morning? ");
        String answer = input.nextLine();
        System.out.println(answer);

        //ask user for the name of the day
        //store the name of the day
        //print a message as: So, it is a "--rainy-- --Sunday--"

        System.out.println("\"What day is today?\"");
        String answer1 = input.nextLine();
        System.out.println("So, it is a "+answer +" "+ answer1 + "!");

        // next() --> will take String till first space
        System.out.println("Which city is this?");
        String city = input.next();
        System.out.println("So, it is a "+answer +" "+ answer1 + " in " + city);

        // ask user for the zipcode, store it, and double check with
        System.out.println("What is your zipcode");
        int zipCode = input.nextInt();
        System.out.println("So, it is a "+answer +" "+ answer1 + " in " + city+ " ,zip code is "+ zipCode);
        System.out.println(zipCode +100);

    }
}
