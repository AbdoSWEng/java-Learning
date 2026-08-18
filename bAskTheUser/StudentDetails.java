import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        String name;
        int age;
        int mark;

        // Heading
        System.out.println("===========================");
        System.out.println("Student Details");
        System.out.println("===========================");

        // read the input
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your mark");
        mark = input.nextInt();

        // diplay output
        System.out.println("======================");
        System.out.println("Student Details       ");
        System.out.println("======================");
        System.out.println("Enter Sudent Name: " + name);
        System.out.println("Enter Student Age: " + age);
        System.out.println("Enter Student Mark: " + mark + "%");
        System.out.println("======================");

    }

}
