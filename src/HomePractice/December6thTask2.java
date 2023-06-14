package HomePractice;

import java.util.Scanner;

public class December6thTask2 {
    public static void main(String[] args) {
        System.out.println("Please enter 5 digit only");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int five, four, three, two, one, a, b, c, d;
        five = input%10;
        a = input/10;
        four = a%10;
        b = a/10;
        three = b%10;
        c = b/10;
        two = c%10;
        d = c/10;
        one = d%10;
        System.out.println(""+five+four+three+two+one);
    }
}
