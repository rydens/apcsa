// Ryan Densmore
// 10/2/18
// Lab 2.5 Product

public class Product {
    private String name;
    private double price;

    public Product(String nameIn, double priceIn) {
        name = nameIn;
        price = priceIn;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void reducePrice(double reduceBy) { price -= reduceBy; }
}