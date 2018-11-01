//Ryan Densmore
//10/4/18
//4.2 Phone Numbers

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Number to format: ");
        String inputNumber = num.nextLine();
        num.close();
        System.out.println("Formatted to (XXX) XXX-XXXX: " + formatPH(inputNumber));
    }

    public static String formatPH(String ph) {
        if (ph.length() == 10) {
            return "(" + ph.substring(0, 3) + ") " + ph.substring(3, 6) + "-" + ph.substring(6);
        } else {
            return "Not proper format- ten digits only.";
        }
    }
}