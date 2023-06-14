package scannerPractice;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // I will print my first name
        //String firstName = "Alex";
        //System.out.println("My first name is: " +firstName);

        // I want to get lastName from user and print --> "your Last name is: ..."

        Scanner scanner = new Scanner(System.in);

        //String lastName = scanner.nextLine();
        //System.out.println(lastName);
        //System.out.println("your Last name is: "+ lastName );

        // get name of the city from user and say "Alex Brown, you are living in .."


        System.out.println("Please type your first name:");
        String firstName1 = scanner.nextLine();
        System.out.println("Please type your last name:");
        String lastName1 = scanner.nextLine();
        System.out.println("Please type your city:");
        String city = scanner.nextLine();
        System.out.println("Your first name: " + firstName1 + " Your last name: " + lastName1 + " you are lining in " + city);



    }
}
