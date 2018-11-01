//Ryan Densmore
//10/2/18
//Lab 3.3 Distances

import java.util.Scanner;

public class DistanceRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter X2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter Y2: ");
        int y2 = sc.nextInt();
        sc.close();

        Distance dist = new Distance(x1, y1, x2, y2);
        dist.calcDistance();
        dist.print();
    }
}