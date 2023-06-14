package ifStatement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter single letter!");
        Scanner input = new Scanner(System.in);
        char letter = input.nextLine().charAt(0);

       if (letter == 'M' || letter == 'm'){
            System.out.println("Monday");
        }
        if (letter == 'T' || letter == 't'){
            System.out.println("Tuesday");
        }
        if (letter == 'W' || letter == 'w'){
            System.out.println("Wednesday");
        }
        if (  letter != 'M' && letter != 'm' && letter != 'T' && letter != 't' && letter != 'W' && letter != 'w'  ){

            System.out.println("Invalid entry");
        }

        // Following code will give compile time error because there is no boolean in the if parentheses

        //int number =1234;
        //if(number){
        //    System.out.println(1234);
       // }


    }
}
