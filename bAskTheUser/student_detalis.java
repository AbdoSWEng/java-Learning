import java.util.Scanner;
public class student_detalis {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);

    char initial;
    String surname;  
    long studentNumber;

    System.out.print("Enter your initial: ");
    initial = input.next().charAt(0);

    System.out.print("Enter your Surname: ");
    surname = input.nextLine();

    System.out.print("Enter you Student number: ");
    studentNumber = input.nextLong();

    //display the details
    System.out.println("\nStudent Details");
    System.out.print("Initial: " + initial);
    System.out.println("Surname: " + surname);
    System.out.println("Sudent number: " + studentNumber);
    
  }
}
