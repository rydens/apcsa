//Ryan Densmore
//10/2/18
//Lab 3.3 Distances

import static java.lang.Math.*;

public class Distance {
    private int xOne, yOne, xTwo, yTwo;
    private double distance;

    public Distance() {

    }
    public Distance(int x1, int y1, int x2, int y2) {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }

    public void setCoordinates(int x1, int y1, int x2, int y2) {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }
    public void calcDistance() {
        distance = sqrt(pow(xTwo - xOne, 2) + pow(yTwo - yOne, 2));
    }
    public double getDistance() {
        return distance;
    }
    public void print() {
        System.out.printf("distance == %.3f\n", distance);
    }
    public String toString() {
        return String.format("distance == %.3f", distance);
    }
}