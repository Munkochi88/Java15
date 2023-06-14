package exceptions;

public class Practice3 {

    // create a method
    // this method have some implementation
    // there will be a type of exception in your logic
    //handle that exception with try-catch block


        public static String reverse(String s) {
            try {
                String s1 = "";
                for (int i = s.length(); i > 0; i--) {
                    s1 += s.charAt(i);
                }
                System.out.println(s1);
                return s1;
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("found exception");
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Finally Block");
            }
            return s;
        }

    public static void main(String[] args) {
            String str = "word";
        try{
            reverse(str);
        }catch (StringIndexOutOfBoundsException s){
            System.out.println(s.getMessage());
        }
    }







}
