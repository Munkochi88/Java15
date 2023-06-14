package object;

import java.util.Arrays;

public class TestVeggie {
    public static void main(String[] args) {
        String[] veggies = {"green pepper","green tomato","potato","carrot","green broccoli"};
       int count =  MethodPractice3.veggieFilter(veggies);
        System.out.println(count);

        MethodPractice3 object1 = new MethodPractice3();
        object1.veggieFilter(veggies);

        String[] product = MethodPractice3.veggieFilter(veggies,7);
        System.out.println(Arrays.toString(product));
    }
}
