package Shapes;

public class ShapesTest {


//    public static void doMath(Rectangle r) {
//        System.out.println(r.getArea());
//        System.out.println(r.getPerimeter());
//    }
//    public static void doSquareMath(Square s) {
//        System.out.println(s.getArea());
//        System.out.println(s.getPerimeter());
//    }

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
////        System.out.println("box1.getArea() = " + box1.getArea());
////        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
////        doMath(box1);
//
//        Square box2 = new Square(5);
////        System.out.println("box2.getArea() = " + box2.getArea());
////        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
////        doSquareMath(box2);

        Measurable mySquare = new Square(5);
        Measurable myRectangle = new Rectangle(5,5);

        System.out.println("mySquare.getPerimeter() = " + mySquare.getPerimeter());
        System.out.println("mySquare.getArea() = " + mySquare.getArea());

        System.out.println("myRectangle.getArea() = " + myRectangle.getArea());
        System.out.println("myRectangle.getPerimeter() = " + myRectangle.getPerimeter());


    }
}
