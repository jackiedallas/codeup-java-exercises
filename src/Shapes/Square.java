package Shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {

    }

    @Override
    public void setLength(double side) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
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
