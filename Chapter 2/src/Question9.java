import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        //creating new Scanner object
        Scanner input = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the number of Miles Driven: ");
        double milesDriven = input.nextDouble();

        System.out.print("Enter the Gallons of gas used: ");
        double gasUsed = input.nextDouble();

        //calculating MPG with the formula KEEP PEMDAS in your mind
        double mpg = milesDriven / gasUsed;

        //converting to int when the answer is int
        if (mpg % 1 == 0) {
            System.out.println("Your car's MPG is: "+ (int)mpg);
        } else {
            System.out.println("Your car's MPG is: "+ mpg);
        }
    }
}
