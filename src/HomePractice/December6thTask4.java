package HomePractice;

import java.util.Scanner;

public class December6thTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any sentence with three words!");
        String input = scanner.nextLine();
        int firstSpace = input.indexOf(" ");
        int secondSpace = input.indexOf(" ", firstSpace+1);
        int thirdInt = input.length()-1;
        int sum = (firstSpace-1)+(secondSpace-1)+thirdInt;
        System.out.println((firstSpace-1) + "-->" +input.charAt(firstSpace-1));
        System.out.println((secondSpace-1)+"-->"+input.charAt(secondSpace-1));
        System.out.println(thirdInt+"-->"+ input.charAt(input.length()-1));
        System.out.println("sum is "+sum);
    }
}
