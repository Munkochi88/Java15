package GroupProject2;

public class Task3 {
    public static void main(String[] args) {
        String word = "    Snicker  ";
        String word1 = word.toUpperCase();
        String word2 = word.trim();
        String substring = word.trim().substring(0,5).toUpperCase();
        char word3 = substring.charAt(0);
        String cookie = "Cookie";
        String cookie1 = cookie.toLowerCase();
        String cookie2 = cookie.replace('o', 'u');
        String cookies = cookie.concat("s");

        //word = word.concat("words");

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(substring);
        System.out.println(word3);
        System.out.println(cookie1);
        System.out.println(cookie.replace('o', 'u'));
        System.out.println(cookie2);
        System.out.println(cookies);

    }
}
