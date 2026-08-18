public class soloProgram {
    public static void main(String[] args) {
        // declare and initilize
        int anInt = 10;
        String doubleLine = "=================";

        // calculate the cube
        int cube = anInt * anInt * anInt;

        // calculate quotient and remainder
        int quotient = anInt / 7;
        int remainder = anInt % 7;

        // calculate the sum
        int sum = cube + remainder;

        // dipaly the output
        System.out.println("My first solo program");
        System.out.println(doubleLine);
        System.out.println(anInt + "cubed is " + cube);
        System.out.println(anInt + "divided by 7 is " + quotient + "rem" + remainder);
        System.out.println("The sum of " + cube + " and " + remainder + " is " + sum);

    }
}