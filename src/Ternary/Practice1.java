package Ternary;

public class Practice1 {
    public static void main(String[] args) {
        //booleanCondition  ?   value1  :   value2

        int a = 16, b = 7;
        int result = a < b ? a+b : a*b;
        System.out.println(result);

        String result1 = a != b ? "Addition" : "Multiplication";
        System.out.println(result1);

        System.out.println(a >= b+9 ? 'c' : "check");

        //String result3 = (a >= b+9 ? 'c' : "check")--> Since data types of the options are different
                                                        //you can not store it.

        String str1 = "I am so lucky";
        String str2 = "It is going great";
        String day = "Sunday";
        System.out.println(day.equals("Monday")?str2:str1);
        System.out.println(a > b ? ++a + ++b : --a + --b);

        //Nested Ternary
        //a > b ? ++a + ++b : --a + --b
        System.out.println(day.equals("Monday")?str2:a > b ? ++a + ++b : --a + --b);
    }
}
