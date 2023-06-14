package HomePractice;

import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] array = {3,6,8,3,2,7,9,9};
        System.out.println(Arrays.toString(array));

        Set<Integer> set = new HashSet<>();
        for (int arr:array){
            set.add(arr);
        }
        System.out.println(set);

    }
}
