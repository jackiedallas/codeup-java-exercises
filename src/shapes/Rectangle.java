package shapes;

public class Rectangle extends Quadrilateral{

    // constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }


    // setters
    public void setWidth(double width) {}
    public void setLength(double length) {}


    // getters
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    public double getArea() {
        return length * width;
    }

//    @Override
//    public double getPerimeter() {
//        return ((2 * this.length) + (2 * this.width));
//    }
//
//    @Override
//    public double getArea() {
//        return this.length * this.width;
//    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//
//
//    public int getArea() {
//        return this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        return ((2 * this.length) + (2 * this.width));
//    }



}
