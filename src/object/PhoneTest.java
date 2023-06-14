package object;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What shape of phone are you looking for?");
        String answer = scanner.nextLine();

        Phone firstPhone = new Phone(answer,"black",799,true);
        System.out.println("rectangle".equalsIgnoreCase(firstPhone.shape));

        firstPhone.call(123);
    }
}
