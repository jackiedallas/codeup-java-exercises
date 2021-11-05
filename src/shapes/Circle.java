package shapes;

public class Circle {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(Math.PI * this.radius);
    }

    public double getCircumference() {
        return Math.round(2 * Math.PI * this.radius);
    }

}
