package ifStatement;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter any data");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        if(text.startsWith("h") && text.length()>10){
            System.out.println("This is what I am looking for!");

        }

    }
}
