package GroupProject3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter any number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        String result = (number%2 ==0) ? "EVEN" : "ODD";
        System.out.println(result);
    }
}
