package Q1;
import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        final double PI = 3.14159;

        double area = PI * Math.pow(radius, 2);
        double circ = 2 * PI * radius;

        System.out.printf("Area: %.3f\n", area);
        System.out.printf("Circumference: %.3f\n", circ);
        // %.2f means "float/double, rounded to 2 decimals"
        // %d -> int
        // %s -> string
        // %c -> char

        input.close();
    }
}
