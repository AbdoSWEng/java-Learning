import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day of the week ");
        int day = input.nextInt();

        // check the number entered
        if (day == 1) {
            System.out.println("Montag");
        }
        if (day == 2) {
            System.out.println("Dienstag");
        }
        if (day == 3) {
            System.out.println("Mittwoch");
        }
        if (day == 4) {
            System.out.println("Donnerstag");
        }
        if (day == 5) {
            System.out.println("Fretag");
        }
        if (day == 6) {
            System.out.println("Samstag");
        }
        if (day == 7) {
            System.out.println("Sonntag");
        }
        // if the user enters an invalid number
        if (day < 1 || day > 7) {
            System.out.println("Invalid day number. ");
        }

    }

}
