package GroupProject2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three different ingredients");
        String ing = sc.nextLine();
        System.out.println("Please enter your number");
        int num = sc.nextInt();

        int space1 = ing.indexOf(" ");
        int space2 = ing.indexOf(" ", space1+1);

        String word1 = ing.substring(0, space1);
        String word2 = ing.substring(space1 + 1, space2);
        String word3 = ing.substring(space2+1);


        String firstLetterOfFirst = ""+word1.charAt(0);
        String firstLetterOfSecond = ""+word2.charAt(0);
        String firstLetterOfThird = ""+word3.charAt(0);

        String convertNum = "" + num;
        String replaceWord1 = word1.replace(firstLetterOfFirst, convertNum);

        num++;

        String convertNum2 = ""+num;
        String replaceWord2 = word2.replace(firstLetterOfSecond, convertNum2);

        num++;

        String convertNum3 = ""+ num;
        String replaceWord3 = word3.replace(firstLetterOfThird, convertNum3);

        System.out.println(replaceWord1+ " "+ replaceWord2 + " " + replaceWord3);


    }
}
