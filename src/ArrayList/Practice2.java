package ArrayList;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        // create an arraylist and store 6 car brands
        // print out brand of every car on the list one by one at a time
        // [a,b,c,d,e,f]

        // a@yahoo.com
        // b@yahoo.com

        ArrayList<String> brands = new ArrayList<>();
        brands.add("benz");
        brands.add("lexus");
        brands.add("mercedes");
        brands.add("audi");
        brands.add("nissan");
        brands.add("tesla");

        for (String car : brands){
            System.out.println(car+"@yahoo.com");
        }
        for (int i = 0; i<brands.size();i++){
            System.out.println(brands.get(i)+"@gmail.com");
        }

        String w = brands.get(0)+"@yahoo.com";

        String b = brands.get(1)+"@yahoo.com";

        String c = brands.get(2)+"@yahoo.com";

        String d = brands.get(3)+"@yahoo.com";

        String e = brands.get(4)+"@yahoo.com";

        String f = brands.get(5)+"@yahoo.com";

        System.out.println(w+b+c+d+e+f);

        filter(brands);

        // create a method that will take an arrayList as parameter
        // parameter arraylist should hold String type elements
        // that method will show only elements which have letter 'a' in it



        ArrayList <String> words = new ArrayList<>();
        words.add("map");
        words.add("goal");
        words.add("home");
        for (String word: words){
            if (word.contains("a")){
                System.out.println(word);
            }
        }
    }
    public static void filter(ArrayList<String> list){
        for (int i=0;i<list.size();i++){
            if(list.get(i).contains("a")){
                System.out.println(list.get(i));
            }
        }
    }
}

