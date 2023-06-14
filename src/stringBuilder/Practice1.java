package stringBuilder;

public class Practice1 {

    public static String alphabet(){
        String str1 = "";
        for (char c = 'A';c<='Z';c++){
            str1+=c;
        }
        return str1;
    }

    // use StringBuilding to print lowercase alphabet
    public static StringBuilder alphabet1(){
        StringBuilder builder = new StringBuilder();
        for (char ch = 'a'; ch<='z';ch++){
            builder.append(ch);
        }return builder;
    }
    public static void main(String[] args) {
        // create a program to print uppercase alphabet as a single String

        String str = "";
        for (char ch = 'A';ch<='Z';ch++){
            str+=ch;
        }
        System.out.println(str);

        StringBuilder builder = new StringBuilder("Sunny");
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        // builder1 = "Winter"; compile time error
        builder1.append("Winter");
        System.out.println(builder1);
        builder1.append(" is not having snow for this year");
        System.out.println(builder1);
        builder1 = builder1.append(" is not having snow for this year");
        System.out.println(builder1);
        builder1.append(builder1.append(" ** "));
        System.out.println(builder1);
        StringBuilder build = alphabet1();
        System.out.println(build);

    }
}
