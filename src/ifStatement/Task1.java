package ifStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please input number between 1 and 5");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number==1){
            System.out.println("Monday");
        }
        if(number==2){
            System.out.println("Tuesday");
        }
        if(number==3){
            System.out.println("Wednesday");
        }
        if(number==4){
            System.out.println("Thursday");
        }
        if(number==5){
            System.out.println("Friday");
        }
        if (number>5 || number<1){
            System.out.println("There is no matching day for your entry");
        }
    }

}
