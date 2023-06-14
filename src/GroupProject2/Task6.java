package GroupProject2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please enter one String value.");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        System.out.println("Please enter first number");
        int startNumber = input.nextInt();
        System.out.println("Please enter second number");
        int endNumber = input.nextInt();

        String result = text.substring(startNumber-1,endNumber);
        System.out.println(result);
    }
}
