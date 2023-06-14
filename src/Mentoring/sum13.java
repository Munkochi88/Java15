package Mentoring;

public class sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;

            } else
            {
            sum+=nums[i];
            }

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] a={1, 2, 13, 2, 1, 13};
        int[]b={13, 1, 2, 13, 2, 1, 13};
        sum13(b);

    }
}
