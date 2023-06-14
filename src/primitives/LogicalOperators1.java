package primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {
        // travel --> passport, ticket
        boolean passport, ticket;
        passport = true; ticket = true;
        boolean travel = passport && ticket;
        System.out.println("Can travel? " + travel);

        // party --> dressCode, age

        boolean dressCode, age;
        dressCode = true; age = true;
        boolean canAttend = dressCode && age;
        System.out.println("Can go to Party "+canAttend);

        // there is an event for kids, and they allow if the age of child is between 12 and 16

        boolean kid12 = true;
        boolean kid13 = true;
        boolean kid14 = true;
        boolean kid15 = true;
        boolean kid16 = true;

        boolean canAttendEvent = kid12 && kid13 && kid14 && kid15 && kid16;
        System.out.println(canAttendEvent);

        int kidAge = 15;
        int lowerLimit = 12, upperLimit = 16;
        boolean happyToPlay = kidAge>lowerLimit && kidAge<upperLimit;
        System.out.println(happyToPlay);

        //parents want to come together for the family dinner,
        //but kids who are age of 12 to 18 don't want to go with them
        //adults and younger kids are together
        //you have 5years old child

        int kidAge1 = 5;
        int lowerLimit1 = 12, upperLimit1 = 18;
        boolean withAdult = kidAge1>=lowerLimit1 || kidAge1 <=upperLimit1;
        System.out.println(withAdult);

        // || OR

        // cash     card

        boolean cash = false, card = true, buy;
        buy = cash || card;
        System.out.println("Buy "+ buy);

        // travel >> a type of ID (passport or government ID), visa, ticket, need to have money(more than $5,000)

        boolean passport1 = true, ID = false, visa = true, ticket1 = true;
        int money = 6000;
        boolean cash1 = money > 5000;
        boolean result1 = passport1 || ID;
        boolean travel1 = result1 && visa && ticket1 && cash1;
        System.out.println(travel1);

        // reads starting from && than ||

        System.out.println(true || false && false); //true

        System.out.println(true && false || false); //false

        System.out.println((true || false) && false); //false





















    }
}
