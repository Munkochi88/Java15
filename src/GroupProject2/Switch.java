package GroupProject2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for the value x");
        int x = sc.nextInt();

        System.out.println("Please enter a number for the value y");
        int y = sc.nextInt();

        int tempValueOfX = x;
        x = y;
        y = tempValueOfX;
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
    }
}
