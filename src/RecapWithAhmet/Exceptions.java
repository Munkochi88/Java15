package RecapWithAhmet;

public class Exceptions {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-How do you handle exceptions?
        -->We can handle the exception with TRY AND CATCH, THROWS

    2-Can you use more than one catch block? How about try block?
        -->You can use more than 1 catch block but only one try block

    3-What do you know about final, finalize, finally? (THE MOST COMMON)
        FINAL: Is a keyword to make the variable or method, class unchangeable
               (last version)
        FINALIZE: Is a method to clean up the unused/useless data(Garbage Collector)
                  for proof we override the finalize method
        FINALLY: Is a block that comes after try and catch block to do final execution
                 no matter what
                 **(database.disconnect)**

    4-What is difference between THROW and THROWS?
        Both Throw and Throws are the concept of exception handling in which
        throws I used to explicit (out of block) throw the exception form a method
        -->public void exception() throws NumberFormat Exception

        -->public void exception2() {
           new throw NumberFormatException(e);

        **While THROWS are used next to method signature(OUTSIDE OF BLOCK)
        **THROW is used inside the block
     */

    public static void main(String[] args) throws InterruptedException {

        String numbers="$199";
//        System.out.println(numbers);
//        int price=Integer.parseInt(numbers);
//        System.out.println(price);
        try{
            System.out.println(numbers);
        int price=Integer.parseInt(numbers);
        System.out.println(price);
        }catch(NumberFormatException exception){
            System.out.println("Your price parsing is not working");
            throw new NumberFormatException();
        }finally {
            System.out.println("I am finally Block");
        }
        Thread.sleep(3000);
    }
}
