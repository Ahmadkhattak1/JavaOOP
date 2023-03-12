import java.util.Scanner;
import java.text.DecimalFormat;
public class Question15 {
    public static void main(String[] args) {
        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //declaring variables
        double sharesBought, pricePerShare, amount, commission, totalAmount;

        System.out.print("How many shares?: ");
        sharesBought = input.nextDouble();

        System.out.print("At what price?: ");
        pricePerShare= input.nextDouble();

        amount = (sharesBought*pricePerShare);
        commission = (amount*0.2);
        totalAmount = (commission+amount);

        //Creating a decimal format object

        DecimalFormat Formatter = new DecimalFormat("###,###.##");

        System.out.println("--------------");
        System.out.println("Money Spent on shares $" + Formatter.format(amount));
        System.out.println("The commission is $" + Formatter.format(commission));
        System.out.println("Total is: $" + Formatter.format(totalAmount));
    }
}
