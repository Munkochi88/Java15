package Loops;

public class alpha {
    public static void main(String[] args) {
        for (char ch1 = 'A', ch2='Z';ch1<=ch2;ch1++){
            if(ch1=='Z'){
                System.out.print(ch1);
            }else{
                System.out.print(ch1+"-");
            }
        }
    }
}
