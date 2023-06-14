package GroupProject4;

public class Task8 {
    public static void main(String[] args) {
        /*
        Interview question:(For ones who are done with all tasks)
        FizzBuzz
        Loop through 0 to 100
        Say the word Fizz instead of the number when it is a multiple of 3.
        Say Buzz if number is a multiple of 5.
        Say FizzBuzz if number is a multiple of both 3 and 5.
         */
        for (int i = 0; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println(i+" :FizzBuzz");
            } else if (i%5==0) {
                System.out.println(i+" :Buzz");
            }else if(i%3==0){
                System.out.println(i+" :Fizz");
            }
        }
    }
}
