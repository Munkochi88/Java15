package oop.abstraction.abstraction1;

public class Alia extends Onlinestudent{
    public Alia(String name, int id){
        super("OnlineName",1111);
    }
    public void study(){
        System.out.println("Alia studies");
    }
    public int test1(){
        return 8;
    }
    @Override
    public int watchViaZoom() {
        return 4;
    }
    @Override
    public void sleep() {
        System.out.println("Alia sleeps");

    }
}
