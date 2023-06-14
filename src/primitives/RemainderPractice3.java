package primitives;

public class RemainderPractice3 {
    public static void main(String[] args) {

        int numberOfCars = 10;
        int numberOfPartners = 3;

        //how many cars each person will get?

        int eachPerson = numberOfCars / numberOfPartners;

        System.out.println(eachPerson);

        //how many cars will be left over?

        int leftOverCars = numberOfCars % numberOfPartners;

        System.out.println(leftOverCars);

        /*
        TV -> $465 --> EACH MONTH $50 payment
         */

        int tv = 465, payment = 50;
        int lastPayment = tv % payment;
        System.out.println(lastPayment);

    }
}
