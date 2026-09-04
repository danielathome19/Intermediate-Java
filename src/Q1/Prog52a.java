package Q1;
import java.util.Scanner;

public class Prog52a {
    public static void main(String[] args) {
        // int length = 143;
        // int width = 82;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        int area = length * width;
        int perim = 2 * length + 2 * width;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perim);

        input.close();
    }
}

/*
Enter length: 5
Enter width: 10
Area: 50
Perimeter: 30
*/