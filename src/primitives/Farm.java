package primitives;

public class Farm {
    public static void main(String[] args) {
        int cows = 25;
        int chickens = 45;
        int cowsLegs = 12 * 4;
        int chickensLegs = 45 * 2;
        int TheTotalNumberOfTheLegsInTheFarmIs = chickensLegs + cowsLegs;
        System.out.println(TheTotalNumberOfTheLegsInTheFarmIs);


// if a single cow cost 1345.86 and a chicken costs 10.99
// calculate total worth of animals and show the result as >> "the worth of the animals is...."

        double cowCost = 1345.86;
        double chickenCost = 10.99;
        double totalCost = (cows * cowCost) + (chickens * chickenCost);
        System.out.println( "The worth of the animals is " + totalCost);

        double share = totalCost / 2;
        System.out.println(share);


    }
}
