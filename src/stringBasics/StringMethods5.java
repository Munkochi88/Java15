package stringBasics;

public class StringMethods5 {
    public static void main(String[] args) {
        String str = "Wednesday";
        String strUpdate = str.replace('e', '*');
        System.out.println(strUpdate);
        String update2 = str.replace("d", "$$");
        System.out.println(update2);
        String update3 = str.replace("day", "-");
        System.out.println(update3);

        String str2 = "      today is so       quiet    ";
        String result = str2.trim();
        System.out.println(result);

        // method chaining(able to call / use another method after method call)

        int number = str2.trim().replace('t', 'T').substring(2,8).length();
        System.out.println(number);

        // String quote = "    From Zero to HERO     "

        String quote = "     From Zero to HERO      ";
        System.out.println(quote.trim().replace("Zero", "one").toUpperCase()); //my own
        System.out.println(quote.replace("Zero","one").toUpperCase().trim().replace(" ", ""));


    }
}
