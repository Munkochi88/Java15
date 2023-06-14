package Loops;

public class ForPractice1 {
    public static void main(String[] args) {
        int num1=0, num2=5;
       /*
       while(num1<num2){
            System.out.println(num1);
            num1++;
        }
        */
        for(;num1<num2;num1++){
            System.out.println(num1);
        }
        for(int number1 = 10, number2 = 20;number1<number2;number2--){
            System.out.println(number2);
        }
        for(int i = 0; i<10;){
            System.out.println(i+1+" I like for Loop");
            i++;
        }
        for(int a = 0; a<5; a++){
            System.out.println("before break time");
        }
        // infinite loop

        for(;;){
            System.out.println("after break");

        }
    }
}
