import java.util.Scanner;
public class Question13
{
    public static void main(String[] args) {
        //creating a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total Charge: ");
        double charge = input.nextDouble();

        //constants
        double tax = 0.0675;
        double tip = 0.2;

        double taxCal = (charge*tax);
        double tipCal = (charge*tip);

        //Displaying
        System.out.println("Total Charge: " + charge + " + " + taxCal + " + " + tipCal+ " tip");
        System.out.println();
        System.out.println("The total is: "+(tipCal+taxCal+charge));



    }
}
