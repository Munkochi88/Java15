package Loops;

public class multi {
    public static void main(String[] args) {
        /*
        making multiplication table
         */

        for(int i = 1; i<= 5; i++){
            for( int k = 1; k <= 10 ; k++){
                System.out.println(i + " * " + k + " = " + (i*k));
            }

            System.out.println("=============");
        }
    }
}
