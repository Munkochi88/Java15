package GroupProject3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your employment year");
        int year = scanner.nextInt();
        System.out.println("please enter your salary");
        int salary = scanner.nextInt();
        double bonus1 = salary + salary*0.05, bonus2 = salary + salary*0.1, bonus3 = salary +salary*0.2;
        if (year >14){
            System.out.println(bonus3);
        } else if (year>= 10) {
            System.out.println(bonus2);
        }else if (year >=5) {
            System.out.println(bonus1);
        }else if (year <5){
            System.out.println(salary);
        }

    }
}
