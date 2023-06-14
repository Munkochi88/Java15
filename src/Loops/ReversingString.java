package Loops;

public class ReversingString {
    public static void main(String[] args) {
        //check if given string palindrome or not
        //EFE, YAY, Tuesday, WOW,...

       String str = "wow";
       String reversed="";
        for (int i = str.length()-1;i>=0;i--){
        reversed+=str.charAt(i);
        }
        if (str.equals(reversed)){
        System.out.println("It is palindrome");
        }else {
        System.out.println("Not palindrome");
        }
    }
}
