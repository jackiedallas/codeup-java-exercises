package Shapes;

public class Square extends Quadrilateral{

    // constructor
    protected Square(double singleSide) {
        super(singleSide, singleSide);
}

    // setters
    public void setWidth(double singleSide) {
        this.width = singleSide;
    }
    public void setLength(double singleSide) {
        this.length = singleSide;
    }

    // getters
    public double getPerimeter() {
        return 2 * this.length + this.width;
    }
    public double getArea() {
        return this.length * this.width;
    }
//    @Override
//    public double getPerimeter() {
//        return ((2 * length) + (2 * width));
//    }
//
//    @Override
//    public double getArea() {
//        return length * width;
//    }

//    private int singleSide;
//
//    public Square(int singleSide) {
//        super(singleSide, singleSide);
//        this.singleSide = singleSide;
//    }
//
//    public int getArea() {
//        return singleSide * singleSide;
//    }
//
//    public int getPerimeter() {
//        return ((2 * singleSide) + (2 * singleSide));
//    }

}
