package HomePractice;

public class December6thTask3 {
    public static void main(String[] args) {
        String str1 = "      Snicker     ";
        String str2 = "Cookie";
        System.out.println(str1.trim().toUpperCase().substring(1).charAt(2));
        System.out.println(str2.toLowerCase().replace('o','u').concat("s"));
    }
}
