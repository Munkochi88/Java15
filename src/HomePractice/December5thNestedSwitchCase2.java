package HomePractice;

public class December5thNestedSwitchCase2 {
    public static void main(String[] args) {
        int a = 0, b = 9;
        switch (a){
            case 0:
                switch (b){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 9:
                        System.out.println("ten");
                        break;
                    default:
                        System.out.println("nested switch case");
                        break;
                }
            default:
                System.out.println("switch case");
                break;
        }
        }
}
