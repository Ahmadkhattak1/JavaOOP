import java.util.Scanner;
public class Question11
{
    public static void main(String[] args)
    {
        //Creating a scanner object
        Scanner input = new Scanner(System.in);

        double percentConst = 0.4;

        //taking an input from the user
        System.out.print("Enter the retail price of Circuit board: ");
        double retailPrice = input.nextDouble();

        double profit = retailPrice*percentConst;

        double total = profit+retailPrice;

        //converting to int

        if (total % 1 == 0 && total == Math.round(total)) {
            System.out.printf("The amount of Profit earned is: %d\n", (int)total);
        } else {
            System.out.println("The amount of Profit earned is: " + total);
        }
    }
}
