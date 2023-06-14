package HomePractice;

import java.util.Scanner;

public class December2nd2 {
    public static void main(String[] args) {
        //String task = "Letsssss solve ittttt";
        System.out.println("Please enter sentence with 3 words!");
        Scanner input = new Scanner(System.in);
        String task = input.nextLine();

        System.out.println(task.substring(0, task.indexOf(" "))); // First word
        System.out.println(task.substring(task.indexOf(" ")+1,task.lastIndexOf(" "))); // Second word
        System.out.println(task.substring(task.lastIndexOf(" ")+1)); // Last word

    }
    }
