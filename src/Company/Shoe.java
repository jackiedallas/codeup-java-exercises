package Company;

public class Shoe extends Product{
    protected double size;
    protected String style;

    public Shoe(String name, double price, double cost, double size, String style) {
        super(name, price, cost);
        this.style = style;
        this.size = size;
    }

    @Override
    public String getName() {
        return style + " " + name;
    }
}
