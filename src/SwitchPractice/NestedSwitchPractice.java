package SwitchPractice;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select following options:" +
                "\n1- IT department \n2- Accounting department \n3- HR department \n4- Help desk");
        int input = scanner.nextInt();

        switch(input){
            case 1:
                scanner.nextLine();
                System.out.println("please select who you want to talk: \nAdam" +
                        "\nBob \nCody");
                String name1 = scanner.nextLine().toLowerCase();
                switch(name1){
                    case "adam":
                        System.out.println("You are talking to "+name1);
                        break;
                    case "bob":
                        System.out.println("You are talking to "+name1);
                        break;
                    case "cody":
                        System.out.println("You are talking to "+name1);
                        break;
                    default:
                        System.out.println("Sorry we don't have "+name1);
                        break;
                }break;
            case 2:
                scanner.nextLine();
                System.out.println("please select who you want to talk: \nDavid" +
                        "\nEric");
                String name2 = scanner.nextLine().toLowerCase();
                switch(name2) {
                    case "eric":
                        System.out.println("You are talking to " + name2);
                        break;
                    case "david":
                        System.out.println("You are talking to " + name2);
                        break;
                    default:
                        System.out.println("Sorry we don't have " + name2);
                        break;
                }break;
                case 3:
                    scanner.nextLine();
                System.out.println("please select who you want to talk: \nFrank" +
                        "\nGeorge");
                String name3 = scanner.nextLine().toLowerCase();
                switch(name3) {
                    case "frank":
                        System.out.println("You are talking to " + name3);
                        break;
                    case "george":
                        System.out.println("You are talking to " + name3);
                        break;
                    default:
                        System.out.println("Sorry we don't have " + name3);
                        break;
                }break;
            case 4:
                System.out.println("Help desk, you are talking to EFE");
                break;
            default:
                System.out.println("Invalid entry");
                break;

        }


    }
}
