package oop.polymorphism;

public class Bank extends Branch{
    public void deposit(){
        System.out.println("Deposit at BANK");
    }
    public void loan(){
        System.out.println("loan from BANK up to 5M");
    }
    public void openBranch(){
        System.out.println("Bank is opening new Branch");
    }
}
