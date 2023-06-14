package Mentoring;

public class Employee {
    int age;
    String title;
    Double salary;

    public Employee(int age,String title,Double salary){
        this.age = age;
        this.salary = salary;
        this.title = title;
    }
    public static void info(Employee employee){
        System.out.println(employee.age+" years old"+
                " makes "+employee.salary+" a year"+"His title is: "+employee.title);
        System.out.println();
    }
}
