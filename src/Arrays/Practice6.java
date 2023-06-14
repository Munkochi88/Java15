package Arrays;

public class Practice6 {
    public static void main(String[] args) {
        char[] symbols = {'a','#', '9','W', '3','6','@'};
        // print out only numbers
        // count digits, letters and other symbols
        // there are ...2.. letters
        // there are ...5.. digits
        // there are ...1.. other symbols
        int digit = 0, letter = 0, other = 0;
        for (int i= 0; i< symbols.length;i++){
            if(symbols[i]>='0' && symbols[i]<='9'){
                digit++;
                System.out.println("These are digits: "+symbols[i]);
            }else if (symbols[i]>='a' && symbols[i]<='z' || symbols[i]>='A' && symbols[i]<='Z'){
                letter++;
                System.out.println("These are letters: "+symbols[i]);
            }else{
                other++;
                System.out.println("Others: "+ symbols[i]);
            }

        }
        System.out.println("There are "+digit+" digits");
        System.out.println("There are "+letter+" letters");
        System.out.println("There are "+other+" others");
    }
}
