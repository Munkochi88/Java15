package GroupProject1;

public class Task5 {
    public static void main(String[] args) {
        double Quarters, Dimes, Nickels, Pennies, totalQuarters, totalnickels, totalDimes, totalPennies, TheTotalInDollars;
        Quarters = 25;
        Dimes = 10;
        Nickels = 5;
        Pennies = 1;
        totalQuarters = Quarters * 5;
        totalnickels = Nickels * 3;
        totalDimes = Dimes * 4;
        totalPennies = Pennies * 2;
        TheTotalInDollars = totalQuarters + totalDimes + totalnickels + totalPennies;

        System.out.println(TheTotalInDollars * 0.01);




    }
}
