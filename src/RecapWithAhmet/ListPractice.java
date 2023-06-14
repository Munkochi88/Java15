package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is the difference between List and Array?
        --> You can go to the ArrayPractice concept to get the answer

    2-What is difference between ArrayList and LinkedList?
        -->List -> is a part of Collection, and It is used for storage(Object)
             -->ArrayList --> It is way of store Objects and access these objects
             with a specific methods. (GET)
             -->LinkedList --> It is way of store Objects and access these objects
             with a specific methods. (GET)

           -->To be honest I do not use LinkedList in my project but as much as I know
           there is execution time difference for accessing the data from the List.
           SHOW OFF:
           **--> The reaching out the elements that inside of the List is more efficient
           and faster in ArrayList.
           ArrayList<Object> --> ArrayList.get(0) --> 0.02
           LinkedList<Object> --> LinkedList.get(0) --> 0.04
           **--> When you do any manipulation(changing value, replacing,inserting,removing)
           at this moment LinkedList will be faster.
           -->If you want to get more details, there is YouTube video.
           (What is the difference between LinkedList and ArrayList(8 min))
     */
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        ArrayList<String > list2 = new ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();
        List<String> list4 = new LinkedList<>();
        list2.add("Hello"); // long way and do not use it one by one. -->
        System.out.println(list2.get(0));
        List<String > names = Arrays.asList("Ahmet","Mehmet","Mahmut","Kerem","Ayse");
        for (String name:names){
            System.out.println(name);
        }
    }
}
