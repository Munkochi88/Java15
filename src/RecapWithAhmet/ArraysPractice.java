package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPractice {
    /*
    POSSIBLE INTERVIEW QUESTION:
    1-What is the difference between Array and ArrayList?
    -->What is...?
    -->What is the purpose of usage?
    -->Where do we use it?
    -->How do we use it?

    -->Array: Is a storage for Primitives and Objects.
    -->The purpose of usage: We can store the data temporary
    and use it for different purpose. (It is a simple way of
    storing multiple data at the time.)

    ArrayList:                              Array:
    1-Dynamic size                          1-Fixed size
    2-Storage for only OBJECT               2-Primitives and Object
    3-It doesn't have multidimensional      3-It has Multidimensional form
    4-It has some good methods(add,get,..)  4-It doesn't have methods but function(length)
    5-ArrayList can be manipulable          5-It is not manipulable because there is no method
    6-Syntax is different                   6-Syntax is different
     */

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        String [] names= {"Ahmet","Mehmet","Mahmut"};
        int[] numbers2 ={1,2};
        System.out.println(numbers2);
        System.out.println(Arrays.toString(numbers2));
        List mix = new ArrayList<>();
        mix.add(numbers2[0]);
        //numbers2[0] //no methods it means this is primitive
        //mix.get(0) //it stores only object
        String.valueOf(numbers2[1]).replace('2','5');

        /*
        ==>Write an implementation that initiliaze int array and find the:
        1-Sum of the even number
        2-SUm of the odd number
        3-Difference between them (the answer shouldn't minus)
        exp: {1,2,3,8,12,65,76,5,22,17} for each:
         */

        int[] nums = {1,2,3,8,12,65,76,5,22,17};
        int sumOfEven=0,sumOfOdd=0,diff=0;
        for (int num:nums){
            if (num%2==0){
                sumOfEven+=num;
            } else if (num%2!=0) {
                sumOfOdd+=num;
            }

        }
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);
        System.out.println(sumOfEven>=sumOfOdd?sumOfEven-sumOfOdd : sumOfOdd-sumOfEven); //*****







    }
}
