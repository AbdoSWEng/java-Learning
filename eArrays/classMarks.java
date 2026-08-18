import java.util.Scanner;
public class classMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        // array containing the student names
        String[] students = {"John", "Mary", "Ahmed", "Sarah", "David"};
        // array that will store the marks entered by the user
        int[] marks = new int[students.length];

        // first for loop
        // dislay each students name and ask the user
        //to enter that students marks
        for(int i = 0; i < students.length; i++){

            System.out.print("Enter makr for " + students[i] + ": ");
            // store the marks in the same position 
            // as the students name
            marks[i] = input.nextInt();
        }
        //second for loop
        // diplay every students name and mark.
        System.out.println("\nStudents Marks: ");

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i] + " - " + marks[i]);
        }
        // variable to store the total of all marks
        int total = 0;

        // third for loop
        // add all the marks together
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        // calculat the average
        double average = (double)total / marks.length;

        // display the average
        System.out.println("\nAverage mark: " + average);




        
    }
    
}
