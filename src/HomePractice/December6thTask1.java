package HomePractice;

import java.util.Scanner;

public class December6thTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter only 6 digit!");
        int input = scanner.nextInt();
        int six, five, four, three, two, one, a, b, c, d, e, multi, sum;
        six = input%10;
        a = input/10;
        five = a%10;
        b = a/10;
        four = b%10;
        c = b/10;
        three = c%10;
        d = c/10;
        two = d%10;
        e = d/10;
        one = e%10;
        sum = six+five+four+three+two+one;
        multi = six*five*four*three*two*one;
        System.out.println(multi);
        System.out.println(sum);

    }
}
