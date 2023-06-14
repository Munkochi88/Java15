package oop.abstraction.abstraction1;

public class Test {
    public static void main(String[] args) {
        Onlinestudent onlinestudent = new Onlinestudent("Ben",2222);
        onlinestudent.watchViaZoom();
        onlinestudent.test1();

        // you cannot create an object from Abstract class
        //Student student = new Student();

        CampusStudent campusStudent = new CampusStudent("Efe",88);
        campusStudent.playTableTennis();
        campusStudent.test1();
        campusStudent.sleep();

    }
}
