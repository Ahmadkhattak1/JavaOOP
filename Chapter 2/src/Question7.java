import java.util.Scanner;
public class Question7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int amountOfPurchase;
        float countyTax = 0.02f;
        float stateTax = 0.04f;

        System.out.print("Enter the amount of Purchase: ");
        amountOfPurchase = input.nextInt();

        System.out.println("Amount of Purchase is: " + amountOfPurchase);
        System.out.println("--------------------------");

        int totalStateTax = (int) (amountOfPurchase*stateTax);
        System.out.println("Total State Tax is: " + totalStateTax);
        int totalCountyTax = (int) (amountOfPurchase*countyTax);
        System.out.println("Total County Tax is: " + totalCountyTax);
        int totalTax = (int) (totalStateTax+totalCountyTax);
        System.out.println("The total Tax is: " + totalTax);

        int totalSale = (int) (amountOfPurchase+totalTax);


        System.out.println("Amount after tax is cut: " + totalSale);

    }
}
