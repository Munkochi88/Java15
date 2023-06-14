package Arrays;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        String[] drinks = {"tea", "water", "coffee", "coke"};
        System.out.println(Arrays.binarySearch(drinks, "water"));
        Arrays.sort(drinks);
        System.out.println(Arrays.binarySearch(drinks, "water"));
        int[] numbers = {3,6,8,10,8,2,11};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 8));

    }
}
