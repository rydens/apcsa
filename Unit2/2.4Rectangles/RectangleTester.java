public class RectangleTester {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5, 5);
        System.out.println(square.getLength());
        System.out.println(square.getWidth());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        square.setLength(10);
        square.setWidth(20);

        System.out.println(square.toString());
    }
}