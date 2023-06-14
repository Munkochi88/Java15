package object;

public class Shape {

    // calculate perimeter of rectangle
    // width, length 2*(w+l)
    // this method is to calculate perimeter of rectangle

    public void perimeterCalculator(int width, int length){
        int perimeter = 2 * (width+length);
        System.out.println("The perimeter of rectangle is "+ perimeter);
    }

    // create method that will calculate area of a triangle
    // A = bxh/2
    // this method is to calculate area of a triangle

    public void areaOfTriangle(double base, double height){
        double area = (base*height)/2;
        System.out.println("The area of triangle is "+ area);
    }
}
