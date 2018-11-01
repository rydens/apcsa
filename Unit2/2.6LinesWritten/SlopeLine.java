public class SlopeLine {
    private double m;
    private double b;

    public SlopeLine(double slope, double intercept) {
        m = slope;
        b = intercept;
    }

    public void setLine(double slope, double intercept) {
        m = slope;
        b = intercept;
    }
    public double getYValue(double x) {
        return m * x + b;
    }
    public String toString() {
        return "y = " + m + "x + " + b;
    }
}