//Ryan Densmore
//10/2/18

public class FahrenheitRunner {
    public static void main(String[] args) {
        System.out.printf("%.2f°F → %.2f°C\n", 98.6, Fahrenheit.convertToCelcius(98.6));
        System.out.printf("%.2f°F → %.2f°C\n", 52.30, Fahrenheit.convertToCelcius(52.30));
        System.out.printf("%.2f°F → %.2f°C\n", 82.45, Fahrenheit.convertToCelcius(82.45));
        System.out.printf("%.2f°F → %.2f°C\n", 75.00, Fahrenheit.convertToCelcius(75.00));
        System.out.printf("%.2f°F → %.2f°C\n", 100.00, Fahrenheit.convertToCelcius(100.00));
    }
}