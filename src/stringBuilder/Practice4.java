package stringBuilder;

public class Practice4 {
    public static void deleteStars(StringBuilder builder){
        for (int i = 0;i<builder.length();i++){
            if (builder.charAt(i) == '*'){
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);

    }

    public static void replaceI(StringBuilder[] builder1){
        for (StringBuilder str : builder1){
            for (int i=0;i<str.length();i++)
            if (str.charAt(i)=='i'){
                str.replace(str.indexOf(""+str.charAt(i)),str.indexOf(""+str.charAt(i))+1,"-");
            }
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("t*****he *****i*nt*ervi*ew *is *coming*");
        deleteStars(builder);
        // {"code", "fish", "interview", "mock", "is", "coming", "soon"}
        // replace every char 'i' with '-' from given StringBuilder array of Strings
        // solve it by creating a method and pass the array as parameter

        StringBuilder[] array = { new StringBuilder("code"),new StringBuilder("fish"),new StringBuilder("interview"),new StringBuilder("mock"),new StringBuilder("is"),new StringBuilder("coming"),new StringBuilder("soon")};
replaceI(array);
    }
}
