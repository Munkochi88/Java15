package Loops;

public class ForEachPractice3 {
    public static void main(String[] args) {
        double[] change = {2.34, 4.5, 1.25, 3.40, 1.20};
        // by using for each loop find total of changes
        double sum = 0;
        for (double change1: change){
            sum+= change1;
            //System.out.println(sum);
        }
        System.out.println(sum);

        int[] numbers = {1,2,3,5,6,7};
        // find the missing number from the given pattern

        for (int i = 0; i< numbers.length-1;i++){
           if (numbers[i+1] - numbers[i]>1){
               System.out.println(numbers[i]+1);
           }
        }
        // {1,2,3,5,6,7}
        int sum1 = 0;
        for (int i = 0;i< numbers.length;i++){
            sum+=numbers[i];
        }
        int sum2 = 0;
        for (int i = 1; i<=7; i++){
            sum+= i;
        }
        System.out.println("Sum-1 "+sum1);
        System.out.println("Sum-2 "+sum2);
        System.out.println("Missing number is "+(sum2-sum1));
    }
}
