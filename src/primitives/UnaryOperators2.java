package primitives;

public class UnaryOperators2 {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;
        int c = a + ++b;
        System.out.println("c is >> " + c);

        c = c++ + --a - 2;
        System.out.println(c);

        int k = 8, t = ++k, m = k + t, x = ++m;
        System.out.println(--x - --k);

        //============== deal on DD ==============

        /*
        get one dozen of donuts for 15 you get $1 discount on your next purchase
        show your next purchase payment amount
         */
        int payment = 15;
        System.out.println(payment--); // today $15 (shows15, value 14)
        System.out.println("Next Payment " + payment);

        /*
        get one dozen of donuts for 15 you get $1 discount on your purchase
        show your purchase payment amount
         */

        int payment1 = 15;
        System.out.println(--payment1 + "$ payment now with applied discount");

    }
}