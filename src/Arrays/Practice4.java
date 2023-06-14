package Arrays;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};
        System.out.println(numbers.length); // size / count of elements (8)
        System.out.println(numbers[0]); // 4
        System.out.println(Arrays.toString(numbers));
        numbers[1] = 88; // giving new value to index 1
        System.out.println(Arrays.toString(numbers));

        // multiply each element by 10 and print out result

        for (int i = 0; i < numbers.length; i++) {
            int result = numbers[i] * 10;
            System.out.println(result);
        }
        // multiply numbers that are greater than 10 by 100 and print out result

        for (int i = 0; i < numbers.length;i++){
            if (numbers[i]>10){
                System.out.print(numbers[i]*100);

            }
        }
    }
}
