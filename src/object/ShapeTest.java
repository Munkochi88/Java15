package object;

public class ShapeTest {
    public static void main(String[] args) {
        Shape a = new Shape();
        a.perimeterCalculator(5,8);
        a.perimeterCalculator(4,5);
        a.areaOfTriangle(5.5, 2.2);
        a.areaOfTriangle(2,5);
        Shape shape1 = new Shape();
        shape1.perimeterCalculator(1,3);
    }
}
