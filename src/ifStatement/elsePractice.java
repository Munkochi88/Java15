package ifStatement;

public class elsePractice {
    public static void main(String[] args) {
        int money = 100;
        if (money > 100){
            System.out.println("Buy");
        }
        else{
            System.out.println("no Buy");
        }

        System.out.println("====================");

        money = 101;
        if(money>100){
            System.out.println("Buy");
        }else{
            System.out.println("no Buy");
        }
    }
}
