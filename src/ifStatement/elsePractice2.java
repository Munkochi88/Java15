package ifStatement;

import java.util.Scanner;

public class elsePractice2 {
    public static void main(String[] args) {
        System.out.println("Can I see your Driver License?");
        Scanner input = new Scanner(System.in);
        String DR = input.nextLine();
        if (DR.equalsIgnoreCase("yes") || DR.contains("yes")){
            System.out.println("you are great");
        }else{
            System.out.println("DMV is next door, please vicit");
        }
    }
}
