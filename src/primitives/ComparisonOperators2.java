package primitives;

public class ComparisonOperators2 {
    public static void main(String[] args) {
        // there is an event, person is 18 years or older can attend the event
        int ageOfPerson = 20;
        int requiredAge = 18;
        boolean canAttend = ageOfPerson >= requiredAge;
        System.out.println(canAttend);

        boolean canAttend1 = requiredAge <= ageOfPerson;
        System.out.println(canAttend1);

        // kids, if the age of kids is 12 or less, that child can go to the event

        int kidAge = 9, requiredKidAge = 12;
        boolean kidCanGo = kidAge <= requiredKidAge;
        System.out.println("Can the kid attend? "+ kidCanGo);

        // if the age of child is 10, they can not participate

        int childAge = 10, canAttent = 10;
        boolean childCanNotAttend = childAge == canAttent;
        System.out.println(childCanNotAttend);








    }
}
