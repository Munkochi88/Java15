package GroupProject1;

import java.util.Scanner;

public class Task6A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dollars = scan.nextDouble();

        int penny, nickle, dime, quarter;
        penny=1; nickle=5; dime=10; quarter=25;
        double dollars1 = dollars * 100;
        int amount = (int)dollars1;

        int quarterPart = amount / quarter;
        int leftOver1 = amount % quarter;
        int dimePart = leftOver1 / dime;
        int leftOver2 = leftOver1 % dime;
        int nicklePart = leftOver2 / nickle;
        int leftOver3 = leftOver2 % nickle;
        int pennyPart = leftOver3 / penny;

        System.out.println("$"+dollars+" will make "+ quarterPart +" quarters "+dimePart+ " dime "+ nicklePart+ " nickles and "+pennyPart+" pennies" );

           }
}
