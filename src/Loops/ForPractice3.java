package Loops;

public class ForPractice3 {
    public static void main(String[] args) {
        String str = "It is a cloudy day in Chicago";
        //print out >> "I found a lowercase 'c'"
            // when you see a lowercase 'c'
            // count how many 'c' in the string?
        int counter = 0;
        for(int index = 0; index < str.length(); index++) {
            char letter = str.charAt(index);
            if (letter == 'c') {
                counter++;
                System.out.println("I found a lowercase 'c'");
            }
            if (index == str.length()-1){
                System.out.println("I found "+counter+" 'c' in the string");
            }
        }
        System.out.println("I found "+counter+" 'c' in the string");
    }
}