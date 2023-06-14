package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        //remainder --> % --> remainder/modulus operator will find the left over from a division question

        int number1 = 17, number2 = 5;
        int r1 = number1 % number2;
        System.out.println(r1 + " is the left over from division " + number1 + " and " + number2);

        int number3 = 123;
        //find out remainder of 123 when it is divided by 10
        int r2 = number3 % 10;
        System.out.println(r2);
        System.out.println(number3 / 10); //12
        System.out.println(number3 % 100); //23
        System.out.println(21 % 10); //1
        System.out.println(3214 % 10); //4
        System.out.println(2007 % 10); //7
        System.out.println(345 % 10);
        System.out.println(34 % 10);
        System.out.println(3 % 10);


    }
}
