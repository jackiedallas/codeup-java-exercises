package Shapes;

public class ShapesTest {


    public static void main(String[] args) {


        Measurable myShape;

        Measurable mySquare = new Square(5);
        Measurable myRectangle = new Rectangle(5,5);

        System.out.println("mySquare.getPerimeter() = " + mySquare.getPerimeter());
        System.out.println("mySquare.getArea() = " + mySquare.getArea());

        System.out.println("myRectangle.getArea() = " + myRectangle.getArea());
        System.out.println("myRectangle.getPerimeter() = " + myRectangle.getPerimeter());

        myShape = new Rectangle(5, 9);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());


    }
}
