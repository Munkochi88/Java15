package Mentoring;

public class sample1 {
    public static void main(String[] args) {
        int number = 4577; int sum=0;
        while (number>0){
            sum=sum+(number%10);
            number=number/10;
        }
        System.out.println(sum);
    }
}
