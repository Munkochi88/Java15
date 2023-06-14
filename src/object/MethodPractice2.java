package object;

import java.util.Scanner;

public class MethodPractice2 {
    public static void main(String[] args) {
        MethodPractice2 john = new MethodPractice2();
        double call1 = john.xyz(3.2,1.8,"multiply");
        System.out.println(call1);
        double call2 = john.xyz(4,4.5,"add");
        System.out.println(call2);
        john.age(1988,2022);
        short a = 2022;
        john.age(a);


    }

    // create a method that will take two double numbers and an operation name
    // this method will return result
    // *operation --> addition or multiplication

    public double xyz(double num1, double num2, String operationName){
        if (operationName.equalsIgnoreCase("multiply")){
            double result = num1*num2;
            return result;
        }else{
            double sum = num1+num2;
            return sum;
        }
    }
    // create a method that will find out your age
    // return and print the age

    public int age(int birthYear, int currentYear){
        int yourAge = currentYear - birthYear;
        System.out.println("Your age is "+yourAge);
        return yourAge;
    }
    public int age(short currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Your age is " + age);
        return age;
    }
}
