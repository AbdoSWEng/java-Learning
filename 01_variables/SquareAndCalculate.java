public class SquareAndCalculate {
    public static void main(String[] args) {
        // Define and initialize the radius
        double radius = 5.0;

        // calculate circumference
        double circumference = 2 * Math.PI * radius;

        // calculate the area
        double area = Math.PI * radius * radius;

        // Display the results
        System.out.print("Radius: " + radius);
        System.out.println("circumference: " + circumference);
        System.out.println("Area: " + area);

    }
}
