package GroupProject4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max
        number. Write a java code that will calculate the sum of
        numbers between the range of min and max and those that
        can only be divided by 3 and 11.
        (min and max numbers are included)
        Example:
        0, 120 -> 33 + 66 + 99 = 198
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Minimum number!");
        int minNumber = scanner.nextInt();
        System.out.println("Please Maximum number!");
        int maxNumber = scanner.nextInt();
        //int a = 0, b= 120;
        int sum = 0;
        for (int i = minNumber; i<=maxNumber; i++){
            if (i%3==0 && i%11==0 && i>0){
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n" + "Sum: "+sum);
    }
}
