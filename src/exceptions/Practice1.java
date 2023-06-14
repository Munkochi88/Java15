package exceptions;

public class Practice1 {
    public static void main(String[] args) {

        try{
            int number = 10;
            String str = "B15"; // NumberFormatException
            int num = Integer.parseInt(str);
            System.out.println(num+10);

            int result = number/0;// ArithmeticException

            System.out.println(result);

            System.out.println("I like math");

        }catch(RuntimeException exception1){
            System.out.println("I caught Exception");
            System.out.println(exception1.getMessage());
        }
        System.out.println("I like java");

    }
}
