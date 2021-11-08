package Company;

public class Subscription extends Product{
    public int numberOfMonths;
    protected double profitPerPeriod;

    public Subscription(String name, double price, double cost, int numberOfMonths) {
        super(name, price, cost);
        this.numberOfMonths = numberOfMonths;
        getProfitPerPeriod();
        type = "Subscription";
    }

    public int getNumberOfMonths(){
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public double getProfitPerPeriod() {
        return numberOfMonths * price;
    }

    @Override
    public String getName() {
        return numberOfMonths + " month subscription to " + name + " magazine";
    }
}
