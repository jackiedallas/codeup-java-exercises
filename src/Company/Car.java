package Company;

public class Car extends Product{
    protected String make;
    protected String model;
    protected int year;

    public Car(String name, double price, double cost, String make, String model, int year) {
        super(name, price, cost);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getName() {
        return year + " " + make + " " + model;
    }
}
