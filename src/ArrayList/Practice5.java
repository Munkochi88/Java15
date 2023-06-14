package ArrayList;

import object.Bottle;

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {
        /*
        create an arrayList
        store some bottle object
        manipulate elements from the arrayList
         */
        ArrayList<Bottle> list = new ArrayList<>();

        Bottle b1 = new Bottle(6);
        Bottle b2 = new Bottle(16);
        Bottle b3 = new Bottle(26);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        System.out.println(list);

        System.out.println(list.get(0).size);
        System.out.println(b1.size);
        System.out.println(list.get(1).liquidAmount);

        System.out.println(b2.size- b1.size);
        System.out.println((list.get(1).size)-(list.get(0).size));

        for (int i = 0; i< list.size();i++){
            if (list.get(i).size>10){
                System.out.println(list.get(i)+" Large");
            }
        }


    }
}
