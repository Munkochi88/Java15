package stringBasics;

public class StringMethods4 {
    public static void main(String[] args) {
        String season = "Winter";
// substring();
        String part = season.substring(1);
        System.out.println(part);
        String part2 = season.substring(1,4); // starts from and till
        System.out.println(part2);
        //System.out.println(season.substring(9)); //StringIndexOutOfBoundsException
        String task = "Letsssss solve ittttt";
        //take and print out the word "do" only from above string
        System.out.println(task.substring(5,7));
        //make above task solution dynamic
        System.out.println(task.substring(task.indexOf(" ")+1,task.lastIndexOf(" ")));
        System.out.println(task.substring(0, task.indexOf(" ")));
        System.out.println(task.substring(task.lastIndexOf(" ")+1));
        //System.out.println(task.substring(task.indexOf(" ")+1, task.indexOf(" ", task.indexOf(" ")+1)));
    }
}
