import java.util.Scanner;

public class ComputeThePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read the length
        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        // read the width
        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        // calculate perimeter
        double perimeter = 2 * (length + width);

        // calculate area
        double area = length * width;

        // display the answers
        System.out.println("Perimeter" + perimeter);
        System.out.println("Area " + area);

    }

}
