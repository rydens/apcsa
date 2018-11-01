public class Rectangle {
    //instance variables
    private double length;
    private double width;

    //contructors
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    public Rectangle() {
        length = 5;
        width = 5;
    }

    //methods
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public void setLength(double l) { length = l; }
    public void setWidth(double w) { width = w; }
    public double getArea() { return length * width; }
    public double getPerimeter() { return length + length + width + width; }
    public String toString() {
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}