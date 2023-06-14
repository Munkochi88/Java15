package primitives;

public class Casting {
    public static void main(String[] args) {
        //implicit
        int num = 23;
        long numL = num;

        //explicit
        int count = 25;
        short countSh = (short)count;
        System.out.println(count);
        System.out.println(countSh);

        int number = 130;
        byte numberBt = (byte)number;
        System.out.println("number -->  " + number);
        System.out.println("Number is the byte type --> " + numberBt);

        double weight = 3.4;
        int weight2 = (int)weight;
        System.out.println(weight2);

        int example = (int)25.6;

        byte b1 = 23, b2 = 12;
        byte sum1 = (byte) (b1 + b2);
        short sum2 = (short) (b1 + b2);
        short sum3 = (byte) (b1 + b2);

        // compound assignments --> +=, -=, *=, /=, %=

        byte result1 = 12;
        result1 += example; // compound assignment is making casting itself

        example -= 1.2;
        System.out.println(example);

    }
}
