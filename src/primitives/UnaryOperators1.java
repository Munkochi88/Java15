package primitives;

public class UnaryOperators1 {
    public static void main(String[] args) { // to run our code
        int studentNumber = 23;
        System.out.println(studentNumber); //23
        studentNumber++;
        System.out.println(studentNumber);//24
        ++studentNumber;
        System.out.println(studentNumber);
//===================
        System.out.println("================");
        System.out.println(studentNumber++);
        System.out.println(studentNumber);
        System.out.println("================");
        System.out.println(++studentNumber);
        System.out.println(studentNumber);

        int number = 12;
        --number;
        System.out.println(number);
        number--;
        System.out.println(number);
        System.out.println(--number); //shows 9 and value is 9
        System.out.println(number); //9
        System.out.println("+++++++++");
        System.out.println(number--); //shows 9 and value is 8
        System.out.println(number); //8



    }
}
