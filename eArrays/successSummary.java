import java.util.Scanner;
public class successSummary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array containing the names of 15 students
        String[] students = {"John", "Mary", "Ahmed", " Sarah", "David", "Peter", "Fatima", "James", "Linda", "Michael", "Aisha", "Daniel", "Sophie", "Kevin", "Ema"};
        // Array containing the marks of the 15 students
        // The two arrays work in parallel
        int [] marks = {65, 48, 82, 74, 39, 91, 55, 67, 45, 88, 76, 52, 93, 41, 70};

        // Variables for calculations
        int total = 0;
        int passed = 0;
        int failed = 0;
        int above75 = 0;
        int passTotal = 0;

        // Assume the first student has the highest mark initially
        int highestMarks = marks[0];
        String highestStudent = students[0];

        // Loop through all students
        for(int i = 0; i < marks.length; i++){
            //calculate total of all marks
            total += marks[i];

            // check whether the student passed or failed
            if(marks[i] >= 50){
                passed++;

            // Loop through all students
            passTotal = passTotal + marks[i];
            } 
            else{
                failed++;
            }
            //count students with marks geater then 75
            if(marks[i] > 75){
                above75++;
            }
            // find the highest mark
            if(marks[i] > highestMarks){
                highestMarks = marks[i];
            }
        }
        // calculate average marks of all students 
        double averageMarks = (double) total / marks.length;

        // Calculate pass-rate percentage
        double passRate = (double)passed / marks.length * 100;

        // calculate average marks of students who passed
        double averagePassMark = (double)passTotal / marks.length;


        // diplay the succes summary
        System.out.println("================================");
        System.out.println("    Succes Summary");
        System.out.println("=================================");

        System.out.println("NUMBER OF STUDENTS: " + students.length);
        System.out.println("Average marks: " + averageMarks);
        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: " + failed);
        System.out.println("Pass ratr: " + passRate + "%");
        System.out.println("Highest mark: " + highestStudent + " (" + highestMarks + ") " + "%");
        System.out.println("Marks above 75%: " + above75);
        System.out.println("Average pass mark: " + averagePassMark + "%");

        System.out.println("==================================");

    }
    
}
