//Ryan Densmore
//10/2/18

public class CircleRunner {
    public static void main(String[] args) {
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 7.5, Circle.calcArea(7.5));
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 10.0, Circle.calcArea(10.0));
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 72.534, Circle.calcArea(72.534));
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 55.0, Circle.calcArea(55.0));
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 101.0, Circle.calcArea(101.0));
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 99.952, Circle.calcArea(99.952));
        System.out.printf("Radius: %.2f\tArea: %.2f\n", 100.0, Circle.calcArea(100.0));
    }
}