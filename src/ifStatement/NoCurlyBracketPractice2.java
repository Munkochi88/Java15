package ifStatement;

public class NoCurlyBracketPractice2 {
    public static void main(String[] args) {
        int k = 3, m = k+5, t=1;
        if (m>=k)
             t = k++ +k + m;
        ++t;
        System.out.println(--t);
        System.out.println(t);

        System.out.println("================");
        if (t<++k)
            ++k;
        ++t;
        System.out.println(++t);
    }
}
