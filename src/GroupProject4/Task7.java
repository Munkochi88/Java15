package GroupProject4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        For this problem ask user to enter three numbers.
        Round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
        so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its
        rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return
        the sum of their rounded values.
        Ex:1
        Input1: 16
        Input2: 17
        Input3: 18
        Output→ 60
        round_sum(12, 13, 14) → 30
        round_sum(6, 4, 4) → 10
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number!");
        int input = scanner.nextInt();
        int multipleOfTen = input/10;
        if(input%10>5){
            multipleOfTen++;
        }
        System.out.println("Please enter second number!");
        int input2 = scanner.nextInt();
        int multipleOfTen2 = input2/10;
        if(input2%10>5){
            multipleOfTen2++;
        }
        System.out.println("Please enter third number!");
        int input3 = scanner.nextInt();
        int multipleOfTen3 = input3/10;
        if(input3%10>5){
            multipleOfTen++;
        }
        int sum = (multipleOfTen*10) + (multipleOfTen2*10) + (multipleOfTen3*10);
        System.out.println(sum);
    }
}
