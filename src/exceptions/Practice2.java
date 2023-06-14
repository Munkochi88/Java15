package exceptions;

public class Practice2 {

    public static void main(String[] args) {



        try{
            System.out.println("First");

            String str = "B15";
            int number = Integer.parseInt(str);

            System.out.println("Second");

            int result = 15/0;

            System.out.println("Third");
        }catch (NumberFormatException e){
            System.out.println("CATCH");
        }catch (ArithmeticException e1){
            System.out.println("CATCH2");
        }

        try {
            String str = "Last";
            String str1 = "";
            for (int i = str.length(); i > 0; i--) {
                str1 += str.charAt(i);
            }
            System.out.println(str1);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
        System.out.println("*******");
    }
}
