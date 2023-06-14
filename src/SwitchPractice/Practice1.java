package SwitchPractice;

public class Practice1 {
    public static void main(String[] args) {
        int count = 18;
        switch (count){
            case 5:
                System.out.println("RED");
                System.out.println("red");
                System.out.println("rED");
                int number = 9;
                System.out.println(number*number);
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 1:
                System.out.println("white");
                break;
            case -9:
                System.out.println("Pink");
                break;
            default:
                System.out.println("NO COLOR");
                break;

        }
    }
}
