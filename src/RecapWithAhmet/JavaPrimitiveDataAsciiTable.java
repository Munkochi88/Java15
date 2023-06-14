package RecapWithAhmet;

public class JavaPrimitiveDataAsciiTable {
    /*
    Possible interview questions:
    1 - What is java and what do you know about JDK, JVM, JRE?

     Java: programming language. To make a connection between computer and people.

        JDK: Java Development Kit that has some libraries which supports application development.
        JRE: Java Runtime Environment which is responsible for "EXECUTIONS".
        JVM:Java Virtual Machine is a virtual machine which is responsible for
            "converting the BYTE code to Binary Code(1,0)"

     PRIMITIVE DATA: It is way to store the data in it. It doesn't take up too much space in memory.

        WHOLE NUMBERS:          DECIMAL NUMBERS:            CONDITION           CHARACTER
        ->BYTE                  ->FLOAT                     ->boolean           ->char
        ->SHORT                 ->DOUBLE ***
        ->INT ***
        ->LONG

     ASCII TABLE: It is table for all the characters(alphabet, digits,symbols etc...)


     */

    public static void main(String[] args) {
        short a=5;
        short b=6;
        short c=(short) (a+b-2);
        //short c=a+b-2;

        char letter = 65;
        char letter2 = 'g';
        int number='g';
        System.out.println(number); //103
        System.out.println(letter2-letter); //103-65 -> 38
        System.out.println(letter2); // g
        System.out.println(letter); // A

        int number1 = 5;
        int number2 = 21;
        boolean condition = number1>number2;
        boolean condition2 = number2>number1;
        System.out.println(condition2); // true
        System.out.println(condition); // false
        double amount = 24.5d;
        double amount2 = 0.235545455;
        System.out.println(amount2);
        System.out.println(amount);

        //int allAmount = amount+amount2; // compile time error
        double allAmount = amount+amount2;
        int allAmount1 = (int) (amount+amount2);
        System.out.println(allAmount);


    }
}

