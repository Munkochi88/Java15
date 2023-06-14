package variables;

public class MultipleVariable {
    public static void main(String[] args) {

        // multiple variables on the same line *when they are sharing same datatype

        int red = 7, green = 8, yellow = 9;  // ok to do it since values are same integer

        System.out.println(red);
        System.out.println(green);
        System.out.println(yellow);

        int number1, number2, number3; // declared three variables
        number1 = 1; number2 = 4; number3 =5;

        char a = 'a' , b = 't' , c = '*' , d = '!';
        char k, l = '6', m = 'm';
        System.out.println( l + m );

    }
}
