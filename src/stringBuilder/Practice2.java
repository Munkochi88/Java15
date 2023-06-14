package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("January");
        Character ch = builder.charAt(0);
        System.out.println(ch);
        Integer i = builder.indexOf("y");
        System.out.println(i);
        String part = builder.substring(3);
        // put substring into a new StringBuilder
        StringBuilder b2 = new StringBuilder(builder.substring(3));
        System.out.println(b2);
        StringBuilder b3 = new StringBuilder();
        b3.append(builder.substring(3));
        System.out.println(b3);
        // replace() --> provide starting index, ending index and replacement value as text
        builder.replace(1,4,"$$$");
        System.out.println(builder);
        builder = builder.replace(1,4,"**");
        System.out.println(builder);

    }
}
