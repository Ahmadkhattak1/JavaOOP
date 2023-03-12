import java.text.DecimalFormat;
import java.util.Scanner;

public class Question19
{
    public static void main(String[] args)
    {
        //Creating scanner object
        Scanner input = new Scanner(System.in);

        //declaring variables
        double sharesBought, pricePerShare, boughtAmount, commission, totalAmount;

        System.out.print("How many shares?: ");
        sharesBought = input.nextDouble();

        System.out.print("At what price?: ");
        pricePerShare= input.nextDouble();

        boughtAmount = (sharesBought*pricePerShare);
        commission = (boughtAmount*0.02);
        totalAmount = (commission+boughtAmount);

        System.out.print("Amount of Shares You Sold: ");
        float sharesSold = input.nextFloat();

        System.out.print("Enter Selling Price: ");
        float sellingPrice = input.nextFloat();

        float soldAmount = sharesSold * sellingPrice;
        double commissionPaid = soldAmount*0.02;
        double total = soldAmount-commissionPaid;
        double profit = total - totalAmount;

        //Creating a decimal format object
        DecimalFormat Formatter = new DecimalFormat("###,###.##");

        System.out.println("--------------");
        System.out.println("Money Spent on shares $" + Formatter.format(boughtAmount));
        System.out.println("The commission is $" + Formatter.format(commission));
        System.out.println("Total is: $" + Formatter.format(totalAmount));

        System.out.println("------------------");

        System.out.println("Total amount you got: $"+Formatter.format(total));
        System.out.println("Commission when sold the stock: $"+Formatter.format(commissionPaid));
        System.out.println("The profit is: $"+Formatter.format(profit));




    }
}

