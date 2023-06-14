package object;

public class TestFlower {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        System.out.println(f1.type);
        f1.type="Tulip";
        System.out.println(f1.type);

        Flower f2 = new Flower("Daisy");
        System.out.println(f2.type);

        Flower f3 = new Flower("Rose","red");
        System.out.println(f3.color);
    }
}
