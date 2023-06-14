package Mentoring;

public class Fibonacci {
    public static void fibonacci(){
        int a=1, b=2,c,i,count=10;
        for (i=1;i<=count;i++){
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
