package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {
        // reverse()
        StringBuilder builder = new StringBuilder("Welcome");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        // toString()
        String str = builder.toString();
        System.out.println(str.toUpperCase());

        String[] words = {"code", "fish", "interview", "mock", "is", "coming", "soon"};
        reversedEveryWord(words);

        String dhl = "Hi Joseph";
        String[] arr = dhl.split(" ");
        List<String> l = new ArrayList<>();
        for (String a : arr) {
            StringBuilder re = new StringBuilder(a);
            l.add(re.reverse().toString());
        }
        System.out.println(l);
    }
    static public List<String> reversedEveryWord (String[] array){
        List<String> list = new ArrayList<>();
        for (String str:array){
            StringBuilder builder = new StringBuilder(str);
            list.add(builder.reverse().toString());
        }
        System.out.println(list);
        return list;
    }
}
