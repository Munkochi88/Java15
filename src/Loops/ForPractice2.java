package Loops;

public class ForPractice2 {
    public static void main(String[] args) {
        // find the sum of numbers between 10 and 15 by using for loop

        int sum=0;
        for(int number = 10 ; number<=15; number++){

            sum = sum+number;
        }
        System.out.println("sum "+sum);
        
        String str = "Today is beautiful";
        //print out every letter from this given string separated by comma

        for (int number = 0;number<str.length();number++){

            //System.out.print(input.charAt(number)+"-");
            if (number == str.length()-1)
                System.out.print(str.charAt(number));
            else
                System.out.print(str.charAt(number)+",");
        }
        // print above without spaces--get rid of spaces and print letters with dash
        System.out.println();
        System.out.println("=============================");
        str = "Today is beautiful";
        str = str.replace(" ", "");
        for (int i = 0; i < str.length(); i++){
            if (i == str.length()-1) {
                System.out.print(str.charAt(i));
            }else{
                System.out.print(str.charAt(i)+"-");
            }
        }
    }
}
