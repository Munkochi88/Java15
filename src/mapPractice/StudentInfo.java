package mapPractice;

import javax.naming.StringRefAddr;
import java.util.*;

public class StudentInfo {
    /*
    FirstName: David
    LastName: Pena
    Age: 25
    Gender: M
    City: Chicago

    FirstName: Jeremiah
    LastName: Michaelson
    Age: 15
    Gender: M
    City: LakeForest

    FirstName: Michael
    LastName: White
    Age: 35
    Gender: M
    City: Winnetka

    FirstName: Sarah
    LastName: Star
    Age: 29
    Gender: F
    City: Chicago

    Store students' information in to Maps
    Store those students, information in to List
    From list of students, find out city of the student
    if student lives out of Chicago, --> "You can join online"
     */

    public static void main(String[] args) {

        HashMap<String, String > map1 = new HashMap<>();
        map1.put("FirstName", "David");
        map1.put("LastName", "Pena");
        map1.put("Age", "25");
        map1.put("Gender", "M");
        map1.put("City", "Chicago");

        HashMap<String, String > map2 = new HashMap<>();
        map2.put("FirstName", "Jeremiah");
        map2.put("LastName", "Michaelson");
        map2.put("Age", "15");
        map2.put("Gender", "M");
        map2.put("City", "Lake Forest");

        HashMap<String, String > map3 = new HashMap<>();
        map3.put("FirstName", "Michael");
        map3.put("LastName", "White");
        map3.put("Age", "35");
        map3.put("Gender", "M");
        map3.put("City", "Winnetka");

        HashMap<String, String > map4 = new HashMap<>();
        map4.put("FirstName", "Sarah");
        map4.put("LastName", "Star");
        map4.put("Age", "29");
        map4.put("Gender", "F");
        map4.put("City", "Chicago");

        List<HashMap<String, String>> list = new ArrayList<>();
        list.add(map1); list.add(map2); list.add(map3); list.add(map4);

        // find students who are age of 30 or younger, they are from Chicago

        for (HashMap<String, String> a : list){
            if (Integer.parseInt(a.get("Age"))<= 30 && a.get("City").equalsIgnoreCase("Chicago")){
                System.out.println(a.get("FirstName")+ " is from Chicago and age of 30 or less");
            }
        }


for (HashMap<String, String> student : list){
    if (!student.get("City").equalsIgnoreCase("Chicago")){
        System.out.println(student.get("FirstName")+ " You can join online");
    }
}
for (int i = 0; i< list.size(); i++){
    if (!list.get(i).get("City").equalsIgnoreCase("Chicago")){
        System.out.println(list.get(i).get("FirstName")+ " **You can join online**");
    }
}


List<List<String>> result1 = fullNameFinder(list);
        HashMap<String, List> result2 = fullNameFinder1(list);
        HashMap<String, List> result3 = cities(list);
        for (Object city : result3.get("Cities")){
            System.out.println(city);
            if (city.toString().equalsIgnoreCase("Winnetka")){
                System.out.println("You are lucky since you are in "+ city);
            }

        }

    }

    /*
    create a method
    pass a parameter as list
    return all student firstNames in one List and lastNames in other List
     */

    public static List<List<String>> fullNameFinder(List<HashMap<String, String >> list){
        List firstNames = new ArrayList<>();
        List lastNames = new ArrayList();
        List<List<String>> fullNames = new ArrayList<>();

        for (HashMap<String , String>student:list){
            firstNames.add(student.get("FirstName"));
            lastNames.add(student.get("LastName"));
        }
        fullNames.add(firstNames);
        fullNames.add(lastNames);
        System.out.println(fullNames);
        return fullNames;
    }
    public static HashMap<String,List> fullNameFinder1(List<HashMap<String, String >> list){
        List firstNames = new ArrayList<>();
        List lastNames = new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();

        for (HashMap<String , String>student:list){
            firstNames.add(student.get("FirstName"));
            lastNames.add(student.get("LastName"));
        }
        map.put("FirstNames",firstNames);
        map.put("LastNames", lastNames);
        System.out.println(map);
        return map;
    }
    public static HashMap<String,List> cities(List<HashMap<String, String >> list){
        List firstNames = new ArrayList<>();
        List lastNames = new ArrayList<>();
        List cities = new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();

        for (HashMap<String , String>student:list){
            cities.add(student.get("City"));
            firstNames.add(student.get("FirstName"));
            lastNames.add(student.get("LastName"));
        }
        map.put("Cities", cities);
        map.put("FirstNames",firstNames);
        map.put("LastNames", lastNames);
        System.out.println(map);
        return map;
    }

}
