package Shapes;

public class Square extends Quadrilateral{
    protected Square(double singleSide) {
        super(singleSide, singleSide);
//        this.width = singleSide;
//        this.length = singleSide;
    }

    @Override
    public void setWidth(double singleSide) {
        this.width = singleSide;
    }

    @Override
    public void setLength(double singleSide) {
        this.length = singleSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.length + this.width;
    }

    @Override
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
