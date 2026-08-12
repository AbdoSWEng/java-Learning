import java.util.Scanner;

public class TestMarksReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        String name;
        double mark1;
        double mark2;
        double mark3;
        double average;

        // read the input
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter the first test: ");
        mark1 = input.nextDouble();

        System.out.print("Enter the Second test: ");
        mark2 = input.nextDouble();

        System.out.print("Enter the 3 test: ");
        mark3 = input.nextDouble();

        // calculate the average
        average = (mark1 + mark2 + mark3) / 3;

        // diplay report
        System.out.println("\n=========================");
        System.out.println("   Student Report");
        System.out.println("\n=========================");
        System.out.println(" Student Name: " + name);
        System.out.println("Marks 1 : " + mark1);
        System.out.println("Marks 2 : " + mark2);
        System.out.println("Marks 3 : " + mark3);
        System.out.println("---------------------------");
        System.out.println("Average : " + average);

    }
}
