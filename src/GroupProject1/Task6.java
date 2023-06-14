package GroupProject1;

public class Task6 {
    public static void main(String[] args) {
        int Quarters, Dimes, Nickels, Pennies, totalQuarters, totalnickels, totalDimes, totalPennies, TheTotalInCents, inCent;
        Quarters = 25;
        Dimes = 10;
        Nickels = 5;
        Pennies = 1;
        TheTotalInCents = 236;
        inCent = TheTotalInCents / Pennies;
        int TotalQuarters = TheTotalInCents / Quarters;
        int remaining1 = TheTotalInCents % Quarters;
        int remaining2 = remaining1 % Dimes;
        int remaining3 = remaining2 % Dimes;

        System.out.println("Total quarters are " + TotalQuarters);
        System.out.println("Total Dimes is " + remaining2);
        System.out.println("Total Cents is " +remaining3);
        //System.out.println(remaining1);


    }
}
