package Shapes;

public class Square extends Rectangle{

    private int singleSide;

    public Square(int singleSide) {
        super(singleSide, singleSide);
        this.singleSide = singleSide;
    }

    public int getArea() {
        return singleSide * singleSide;
    }

    public int getPerimeter() {
        return ((2 * singleSide) + (2 * singleSide));
    }

}
