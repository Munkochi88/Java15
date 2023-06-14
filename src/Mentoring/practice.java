package Mentoring;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class practice {
    public static void primeNumber(int num){
        int a=0;
        for (int i=1;i<=num;i++){
            if(num%i==0&&num%num==0){
                a++;
            }
        }
        if (a==2){
            System.out.println("prime number");
        }else{
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) {
        primeNumber(6);
    }
}
