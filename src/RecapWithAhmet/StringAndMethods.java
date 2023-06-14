package RecapWithAhmet;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class StringAndMethods {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1->Most of technical questions are related with String and its Methods?

    2-What is the difference between (.) and (==)

        String (.equals) -> Making a comparison of "TWO VALUES"
          String name = "AHMET";
          String anotherName = new String("AHMET");

--> First of all, that is a great question and tricky question. I do not use a lot of (==) for
    String value comparison other than other primitive types(int,long)
    When I use String.equals method it compares only the Value of the data
    When I use == which compares not only the Value but also Location of the object.

    3-What is String and how do you declare?
    // GENERAL DESCRIPTION:
    String is an object that used store some data.
    // YOU CAN GO DEEP
    // String has some specific methods that we use for any purpose like comparison.
    // I can declare the String with TWO ways
        1-String str; DECLARE: Means you create a bucket without assigning any value
          String str = "AHMET"; INITIALIZE: means you create a bucket with Assigning a value
        2-String str3=new String(); DECLERATION
          String str4=new String("AHMET") INITIALIZATION

      3-STRING METHODS: * MEAN IT IS REALLY IMPORTANT NOT ONLY FOR TECHNICAL BUT ALSO AUTOMATION

        1-IndexOf()--> IT GIVES YOU THE INDEX NUMBER OF CHARACTER. IT RETURNS INT
        2-LENGTH()--> IT GIVES YOU THE SIZE OF THE DATA(VALUE). IT RETURNS INT
        3-CONCAT()--> IT IS A WAY TO COMBINE TWO OR MORE VALUES. (CONCAT() OR "+"). IT RETURNS STRING
        4-SPLIT()--> IT IS A WAY TO CUT THE WORDS FROM SPECIFIC SPOT. IT RETURNS STRING ARRAY
        5-STARTSWITH()--> IT CHECKS THE VALUE STARTS WITH A SPECIFIC CHARACTER/WORDS. IT RETURNS BOOLEAN
        6-ENDSWITH()--> IT CHECKS THE VALUE ENDS WITH A SPECIFIC CHARACTER/WORDS. IT RETURNS BOOLEAN
       *7-SUBSTRING()--> IT IS A WAY TO GET SPECIFIC CHARACTERS/WORDS FROM STRING. IT RETURNS STRING
       *8-CHARAT()--> IT GIVEW=S YOU THE CHARACTER OF A SPECIFIC INDEX SPOT. IT RETURS CHAR
     ***9-CONTAINS()--> IT CHECKS THE VALUE HAS THE DATA THAT YOU ARE LOOKING FOR. IT RETURNS BOOLEAN
     ***10-TRIM()--> IT REMOVES THE SPACES FROM BEGINNING, FROM END
       *11-REPLACE() --> IT REPLACES THE SPECIFIC CHARACTER/WORDS IN STRING. IT RETURNS STRING
     ***12-EQUALS() --> IT COMPARES TWO VALUES OF VARIABLE. IT RETURNS BOOLEAN
       *13-EQUALIGNARECASE() --> IT COMPARES TWO VALUES OF VARIABLE WITHOUT CASE SENSITIVITY
      **14-VALUEOF() --> IT CONVERTS THE DIFFERENT DATA TYPE TO STRING TYPE. IT RETURNS STRING
       *15-ToUpper/ToLower --> IT CHANGES THE CHARACTERS TO UPPER OR LOWER CASE. IT RETURNS STRING


        TIPS: Once you are explaining anything in IT:
        1-Use IT Terminology --> declare,initialize etc..
        2-Explain from general to deep.
     */

    public static void main(String[] args) {

//        String name = "AHMET";
//        String anotherName = new String("AHMET");
//        System.out.println(name.equals(anotherName)); // true -> only comparing values
//        System.out.println(name==anotherName); // false -> not only comparing values but also location
//        System.out.println(name.hashCode());
//        System.out.println(anotherName.hashCode());

        String str="Ahmet loves java";
        String str1=new String("Ahmet loves java");
        String str2="Ahmet loves java";
        String str3=new String("Ahmet loves java");
        System.out.println(str.equals(str1));//true ->only value
        System.out.println(str1==(str3));//false ->I am not only comparing value but also location
        System.out.println(str.equals(str2));//true -> both of them are under String pool
        System.out.println(str.indexOf('t')); // index starts from 0
        System.out.println(str.length()); // length starts with 1
        System.out.println(str.concat(" "+str2)); // Ahmet loves java Ahmet loves java
        String[] words = str.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(Arrays.toString(words));
        System.out.println(str2.startsWith("Ahmet")); //true
        System.out.println(str2.endsWith("Va")); //false
        char character=str2.charAt(3);
        String sbst=str2.substring(3,4);
        System.out.println(character);
        System.out.println(sbst.toLowerCase());
        System.out.println(sbst.toUpperCase());
        String exp = "Hello Guys";
        String exp2 = "hello guys";
        System.out.println(exp2.equalsIgnoreCase(exp)); // I would use 99 percent equals for validation
        int number=5;
        int number2=3;
        String bucket=String.valueOf(number) + String.valueOf(number2);
        System.out.println(bucket);
        boolean result=str2.contains("av"); // Ahmet loves java
        System.out.println(result);
        String lastExample=" We are completing String".trim();
        String lastExample2="We are completing String";
        System.out.println(lastExample2.equals(lastExample));


    }
}
