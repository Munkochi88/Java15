package HomePractice;

import java.util.Scanner;

public class monkey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("is monkey1 is smiling?");
        boolean smile1 = scanner.hasNextBoolean();
        System.out.println("is monkey2 smiling?");
        boolean smile2 = scanner.hasNextBoolean();
        if (smile1==smile2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
