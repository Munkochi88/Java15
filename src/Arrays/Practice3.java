package Arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        String[] studentsNames = new String[9];
        studentsNames[0] = "Alex";
        studentsNames[1] = "Ana";
        studentsNames[2] = "Dilyana";
        studentsNames[3] = "A O";
        studentsNames[4] = "Stan";
        studentsNames[5] = "Diana";

        System.out.println(Arrays.toString(studentsNames));

        // print out name if the name has letter 'l' into it

        for (int i = 0;i< studentsNames.length;i++){
            if (studentsNames[i] != null){

            if (studentsNames[i].contains("l")) {
                System.out.println(studentsNames[i]);
                }
            }
        }

    }
}

