package Company;

public class Product {
    protected String name;
    protected Double price;
    protected double cost;
    protected String type;

    public Product(){} // default constructor

    public Product(String name, double price, double cost) {
        this.name = name;
        this.price = price;
        this.cost = cost;
    }

    public Product(String name, double price, double cost, String type) {
        this.price = price;
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public double getProfit() {
        return price - cost;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void getType() {
        System.out.println("Product is a " + type);
    }
}
