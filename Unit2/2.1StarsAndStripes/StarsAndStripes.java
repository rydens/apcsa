// Ryan Densmore
// 9/7/18
// 2A
// 2.1 Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes {
    public StarsAndStripes() {
        out.println("StarsAndStripes");
        printTwoBlankLines();
    }
    public void printTwentyStars() {
        out.println("********************");
    }
    public void printTwentyDashes() {
        out.println("--------------------");
    }
    public void printTwoBlankLines() {
        out.println("\n\n");
    }
    public void printASmallBox() {
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }
    public void printABigBox() {
        printASmallBox();
        printASmallBox();
    }
}