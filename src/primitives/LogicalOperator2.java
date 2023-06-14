package primitives;

public class LogicalOperator2 {
    public static void main(String[] args) {
        // you need to have average of 60% to pass a class when you get 3 test
        // our range for the test score is 0 to 100
        // AND
        // you need to have 90% attendance

        int test1 = 50, test2 = 100, test3=80, average, requiredAverage=60, requiredAttendance = 90, myAttendance = 100;
        average = (test1 + test2 + test3) / 3;
        boolean result = average >= requiredAverage && myAttendance >= requiredAttendance;
        System.out.println(result);
    }
}
