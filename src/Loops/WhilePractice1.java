package Loops;

public class WhilePractice1 {
    public static void main(String[] args) {
        //print "hello" for ten times
        int count = 0;
        while(count<10){       // condition must be true to run the code.
            count++;
            System.out.println("hello");
            System.out.println(count);
        }
        int number = 20;
        int a =1;
        while (number>10){
            System.out.println(a+". bye");
            number--;
            a++;
        }

        //infinite loop
      //  while(6==6){
      //      System.out.println("Java is my favorite");
      //  }

    }
}
