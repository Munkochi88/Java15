package stringBuilder;



public class Task1 {
    public static int sum(StringBuilder builder){
        int sum=0;
        for (int i=0;i<builder.length();i++){
            if (builder.charAt(i)>='0' && builder.charAt(i)<='9'){
                sum+=Integer.parseInt(""+builder.charAt(i));
                //Integer.parseInt(String.valueOf(builder.charAt(i)));
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("AFA@$%56y2l");
        sum(stringBuilder);
    }
}
//
//    public static int sumOfDigits(StringBuilder builder) {
//
//        int sum = 0;
//        for (int i = 0; i < builder.length(); i++) {
//            char ch = builder.charAt(i);
//
//            if (Character.isDigit(ch)) {
//                sum += ch;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        StringBuilder sb = new StringBuilder(  "AFA@$%adfg56y2L" );
//
//        int result = sumOfDigits(sb);
//        System.out.println(result);
//    }
//}
