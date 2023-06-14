package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user that how many chocolate names s/he wants to store in an array
        get the names of the chocolates from use
        and store them into an array
        print stored elements back to the user at the same time
        if the name has 5 or less letter store it in to 'shortNames' array
        otherwise store it into 'longNames' array
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many chocolates do you want to store?");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[size];
        String[] shortNames = new String[size];
        String[] longNames = new String[size];
        for (int i = 0;i<size;i++) {

            System.out.println("Please name the chocolates "+(i+1));
            String str = scanner.nextLine();
            names[i] = str;

            if (str.length()>5){
                longNames[i]=str;
            }else{
                shortNames[i]=str;
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
    }
}
