package RecapWithAhmet;

import java.util.Arrays;
import java.util.Map;

public class SplitMethod {
    /*
    POSSIBLE INTERVIEW QUESTION:
    String str="Hello Java is so good"

    output:olleH avaJ si  os doog
       avaJ
       si
       os
       doog
     */

    public static void main(String[] args) {
        String str="Hello Java is so good";
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
        for (String word : array){
            String reverse="";
            for (int i=word.length()-1;i>=0;i--){
               reverse+=word.charAt(i);
            }
            System.out.print(reverse+" ");
        }


    }

}
