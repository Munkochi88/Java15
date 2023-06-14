package ArrayList;


import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(5);
        ArrayList list3 = new ArrayList(list1);
        ArrayList <String>list = new ArrayList<>();

        System.out.println(list);
        list.add("tomatoes");
        System.out.println(list);
        list.add("cucumbers");
        list.add("Potatoes");
        list.add("cherries");
        list.add("lettuce");
        System.out.println(list);
        System.out.println(list.get(4));
        String item = list.get(3);
        System.out.println(item);
        list.add(3,"bananas");
        System.out.println(list);
        //list.clear();
        System.out.println(list);

        // size()
        int size = list.size();
        System.out.println(size);

        // set() --> it will replace the element at given index
        list.set(4,"Dressing");
        System.out.println(list);

        // remove()
        list.remove(4);
        System.out.println(list);
        System.out.println(list.size());

        list.remove("bananas");
        System.out.println(list);

        // clear()
        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        //

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("bread");
        list.add("cheese");
        list5.add("mayo");
        list.addAll(list5);
        System.out.println(list);


    }
}
