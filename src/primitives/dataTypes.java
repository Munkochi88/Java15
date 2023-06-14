package primitives;

public class dataTypes {
    public static void main(String[] args) {
        byte bt1 = 3; // -128 to 127
        System.out.println(bt1);

        short numberSh = 1230; //
        System.out.println(numberSh);

        int numberI = 1;
        System.out.println(numberI);

        long numberL = 1232131231234321L;

        float number5 = 2.3f;
        System.out.println(number5);

        float number6 = .7f;
        System.out.println(number6);

        float number7 = 5f;
        System.out.println(number7); // 5.0

        double numberD = 2;
        System.out.println(numberD); // 2.0

        byte b1 = 5;
        short sh1 = b1;
        System.out.println(sh1); // shows 5
     // byte  bt2 = sh1; --> short can't be stored in byte. because of data type, compile time error (logical error)

     // int age = numberD; --> because of data type, compile time error (logical error)

     // int age = 2.5; --> because of data type, compile time error (logical error)

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        int number9 = 1_000_000; // for reading purpose we can use underscore
        int number10 = 123_1343_8;
        System.out.println(number9);



    }
}
