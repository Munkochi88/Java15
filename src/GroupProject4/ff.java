package GroupProject4;

public class ff {
    public static void main(String[] args) {
        String str = "Word";
        String reversed = "";
        for (int i = str.length()-1; i>=0;i--){
            reversed+=str.charAt(i);
            //System.out.println(reversed);
        }System.out.println(reversed);
    }
}
