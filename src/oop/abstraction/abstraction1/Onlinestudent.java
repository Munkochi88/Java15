package oop.abstraction.abstraction1;

public class Onlinestudent extends Student{
    public Onlinestudent(String name, int id){
        super("Tim",1234);
    }

    public void study(){
        System.out.println("Online student studies");
    }
    public int test1(){
        System.out.println("OnlineStudent Test");
        return 4;
    }
    public int watchViaZoom(){
        System.out.println("Attending via zoom");
        return 4;
    }
}
