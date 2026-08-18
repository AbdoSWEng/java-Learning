import java.util.Scanner;
public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array containing the heights of 10 people in metres
        double[] heights = {1.70, 1.80, 1.65, 1.75, 1.60, 1.90, 1.72, 1.68, 1.82, 1.77};

        // Array containing the weights of 10 people in kilograms
        double[] weights = {65, 80, 55, 75, 50, 95, 70, 60, 85, 78};

        // Loop through both arrays
    for(int i = 0; i < heights.length; i++ ){
        // Calculate BMI for the current person
        double bmi = weights[i] / (heights[i] * heights[i]);
        
        // Display height and weight
        System.out.println("Person: " + (i + 1));
        System.out.println("Height: " + heights[i] + " m");
        System.out.println("Weight: " + weights[i] + "kg");

        // Display BMI
        System.out.println("BMI: " + bmi);

        //Determine BMI category
        if(bmi < 18.5){
            System.out.println("Category: Underweigh");
        } else if ( bmi < 25){
            System.out.println("Category: Normal weight");
        }else{
            System.out.println("Category: Obese");
        }

        System.out.println("-------------------------");
    }

    }
    
}
