public class ProductTester {
    public static void main(String[] args) {
        Product toaster = new Product("toaster", 19.95);
        Product macbook = new Product("toaster", 2499.99);

        System.out.println("New Toaster: " + toaster.getName() + ": $" + toaster.getPrice());
        System.out.println("New Macbook: " + macbook.getName() + ": $" + macbook.getPrice());

        toaster.reducePrice(5.00);
        macbook.reducePrice(5.00);
        System.out.println("Student Discount Toaster: " + toaster.getName() + ": $" + toaster.getPrice());
        System.out.println("Student Discount Macbook: " + macbook.getName() + ": $" + macbook.getPrice());
    }
}