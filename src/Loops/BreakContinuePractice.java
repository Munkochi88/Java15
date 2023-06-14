package Loops;

public class BreakContinuePractice {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
            break;
            // System.out.println(); --> not reachable statement, because it is after break statement
        }
        System.out.println("***********");
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("Hi");
                break;
            }
        }
        System.out.println("+++++++++++++++");

        for (int i = 0; i < 16; i++) {

            if (i == 13) {
                continue; // skipping
            }
            System.out.println(i+"bye");
        }
    }
}
