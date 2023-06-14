package stringBasics;

public class Practice1 {
    public static void main(String[] args){
        String word = "Fluffy";
        System.out.println(word);
        System.out.println(word + 5 + 3);

        //reassignment
        word = "Test";
        System.out.println(word);

        //compound assignment
        word = "Test";
        word += word;
        System.out.println(word); //TestTest

        String text = "1234";
        System.out.println(text + 100);
        System.out.println(text + word);
        System.out.println(text);
        text +="5"; //text = text + "5";
        System.out.println(text); //12345
        text += 6;
        System.out.println(text); //123456

        int number = 333;
        text +=number;
        System.out.println(text);
        String name = "Java"+111;
        System.out.println(name);
        String LastName = "Selenium" + 't';
        System.out.println(LastName);
        name = "Jenny";
        LastName = "Brown";
        name = name + LastName; //Concatenation
        System.out.println(name); //JennyBrown
        System.out.println(LastName); //Brown

        String lunch = new String( "Burger");
        System.out.println(lunch); // Burger
        lunch += " with fries";
        System.out.println(lunch);



    }
}
