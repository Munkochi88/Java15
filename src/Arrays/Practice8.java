package Arrays;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {
        String[] brands = {"Nike", "Adidas", "Puma", "New Balance", "Reebok"};
        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};
        // sort()
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(brands));
        Arrays.sort(brands);
        System.out.println(Arrays.toString(brands));

    }
}
