package Loops;

public class ForPractice4 {
    public static void main(String[] args) {
        // print out alphabet as uppercase letters
        // A, B, C, ...., Z
        for (char ch1 = 'A', ch2 = 'Z'; ch1<=ch2; ch1++){
            if(ch1=='Z'){
                System.out.println(ch1);
            }else {
                System.out.print(ch1 + "*");
            }
        }
        for(int i = 0; i<9; i++){
            if(i==9) {
                System.out.print(i);
            }else{
                System.out.print(i+"$");
            }
        }
    }
}
