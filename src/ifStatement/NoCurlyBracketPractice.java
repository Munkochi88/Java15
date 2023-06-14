package ifStatement;

public class NoCurlyBracketPractice {
    public static void main(String[] args) {
        if (5 ==5 )
            System.out.println("hi");
        System.out.println("hello");

        System.out.println("=======================");

        if (5 ==8 )
            System.out.println("hi"); // only effecting very next line
        System.out.println("hello");
    }
}
