package Loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //"***" for ten times with WHILE LOOP

        int num = 1, last = 10;
        while(num<=last){
            System.out.println("***");
            num++;
        }

        //"***" for ten times with DO-WHILE LOOP

        num = 1; last = 10;
        do{
            System.out.println("$$$");
            num++;
        }while(num<=last);

        num = 1; last = 10;
        do{
            System.out.println("@@@");
            num++;
        }while(num>last);

    }
}
