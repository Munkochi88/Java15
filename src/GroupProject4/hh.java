package GroupProject4;

import java.util.Scanner;

public class hh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<3;i++){
            System.out.println("Please enter an integer");
            int number = scanner.nextInt();
            int multipleOfTen = number/10;
            if(number%10>=5){
                multipleOfTen++;
            }
            sum += multipleOfTen*10;
        }
        System.out.println(sum);
    }
}
