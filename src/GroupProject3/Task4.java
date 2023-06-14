package GroupProject3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any character with Upper case or Lower case ");
        String input = scanner.next();
        if (input.equals(input.toLowerCase())){
            System.out.println("your input is with lower Case");
        }else{
            System.out.println("your input is with Upper Case");
        }

    }
}
