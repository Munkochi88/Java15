package Loops;

public class WhilePractice7 {
    public static void main(String[] args) {
        /*
        find sum of numbers between 10 and 15
        10+11+12+13+14+15=75
         */
        int num1 = 10, num2 = 15, sum1 = 0;
        while (num1<=num2){
            //sum = sum + num1;
            sum1+=num1;
            num1++;

        }
        System.out.println("Sum of the numbers between 10 to 15 is: "+sum1);

        // find the sum of even numbers from 1 to 15.

        int num3 = 1, num4 = 15, sum2=0;
        while (num3<=num4){

            if (num3 % 2 ==0){
                sum2 = sum2 + num3;
            }
            num3++;
        }
        System.out.println("the sum of even numbers from 1 to 15: "+ sum2);
    }
}
