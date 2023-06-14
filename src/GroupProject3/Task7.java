package GroupProject3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year to check either LEAP YEAR or not ");
        int year = scanner.nextInt();
        if (year%4==0 && year % 100!=0 || year%400==0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }

    }
}
