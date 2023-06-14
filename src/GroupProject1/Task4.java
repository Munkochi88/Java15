package GroupProject1;

public class Task4 {
    public static void main(String[] args) {


        int minutes = 3456789;   // INPUT
        int minInYear = 365*24*60;  // 525600 mins in a year
        int minInDay = 24*60;
        int leftover = minutes % minInYear;
        int minues1 = leftover / minInDay;
        int numberYear = minutes / minInYear;
        System.out.println("In " + minutes + " minutes is approximately " + numberYear+ " years " + "and  " + minues1 + " days");   // number of years

    }
}


