package primitives;

public class charPractice {
    public static void main(String[] args) {
        char letter1 = 'A';
        System.out.println(letter1); // A
        char symbol1 = '*';
        System.out.println(symbol1); // *
        char letter2 = 'z';
        System.out.println(letter2); // z
        char symbol2 = '6';
        System.out.println(symbol2 + letter2); // 176
        int symbol3 = 'z';
        System.out.println(symbol3); // 122
        char symbol4 = 90;
        System.out.println(symbol4); // Z

        char symbol5 = 80;
        int symbol6 = 'K';
        System.out.println(symbol5);
        System.out.println(symbol6);

        //what if you want to print everything as is on the single print

        System.out.println("" + symbol5 + symbol6);
        System.out.println("" + " " + symbol5 + " " + symbol6);

    }
}
