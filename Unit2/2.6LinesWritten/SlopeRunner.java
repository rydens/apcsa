public class SlopeRunner {
    public static void main(String[] args) {
        SlopeLine demo = new SlopeLine(5, 3);
        System.out.println(demo);
        System.out.println(demo.getYValue(5));

        demo.setLine(8, 4);
        System.out.println(demo);
        System.out.println(demo.getYValue(0));
    }
}