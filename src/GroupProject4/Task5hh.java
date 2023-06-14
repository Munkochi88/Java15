package GroupProject4;

import java.util.Scanner;

public class Task5hh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter one string value");
        String str = sc.nextLine();

        str = str.trim().toLowerCase();
        String bucket="";

        for (int i = 0; i < str.length(); i++) {
            String letter=str.charAt(i)+"";

            if (!bucket.contains(letter)){
                bucket+=letter;
            }else if(letter.equals(" ")){
                bucket+=letter;

            }

        }System.out.println(bucket);
    }
}
