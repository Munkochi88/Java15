package oop.finalPractice;

public final class T_Shirt extends Shirt{

    public void sale(){
        System.out.println("T-shirt sale");
    }
    // final method from parent cannot be overridden
//    public void dye(){
//        System.out.println("***");
//    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.dye();
        shirt.dye("RED");

        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        Shirt shirt4 = new Shirt();

        shirt1 = null;
        shirt2 = null;

        System.gc();

    }
}
