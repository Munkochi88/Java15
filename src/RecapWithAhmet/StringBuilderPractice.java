package RecapWithAhmet;

public class StringBuilderPractice {
    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is the difference between String and StringBuilder?
        -->They are both useful for my project in terms of Mutability and Immutability
            ->String is Immutable
            ->String Builder is Mutable
            ->StringBuilder has some different methods --> append, reverse...

    2-What is the difference between String Builder and string Buffer?
        -->String Buffer and HashTable are both synchronized
        -->Map,List,Set,String,String Builder are not synchronized

        NOTE: Mutable is all about the giving functions/actions/manipulation without
              "RE-ASSIGNING" the value
       NOTE2: Immutable is all about the giving functions/actions/manipulation with
              "RE-ASSIGNING" the value
       NOTE3: PassByValue and PassByReference is all about the way that you pass the data

            --> If you call the method and pass the value directly/initializing
            (StringBuilderRecap.run("AHMET") --> It means you are passing the value -->PassByValue

            --> If you call the method and pass the value with a reference
            String name = "Ahmet";
            StringBuilderRecap.run(name); --> PassByReference
     */
    public static void main(String[] args) {
        // Immutability:
        String name = "Ahmet";
        name.replace("m","*").concat("Loves").concat("Java  ").trim();
        System.out.println(name);
        // Mutability:
        StringBuilder builder = new StringBuilder("Ahmet");
        builder.replace(2,3,"*").append("Loves").append("Java   ").trimToSize();
        System.out.println(builder);
        System.out.println(builder.reverse());
        String reverse = builder.toString();
        System.out.println(reverse);
        String reverse2 = String.valueOf(builder.reverse()); // ***
        System.out.println(reverse2);
        StringBuffer stringBuffer = new StringBuffer();


    }
}
