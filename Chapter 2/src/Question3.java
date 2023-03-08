import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        // creating an input object

        Scanner input = new Scanner(System.in);

        //Declaring variables

        String name, address, collegeMajor;
        int zipCode, telephoneNum;

        // Getting values from the user

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter the address: ");
        address = input.nextLine();
        input.nextLine();

        System.out.print("Enter your College Major: ");
        collegeMajor = input.nextLine();

        System.out.print("Enter your Contact: ");
        telephoneNum = input.nextInt();

        System.out.print("Enter your ZIP: ");
        zipCode = input.nextInt();


        System.out.println("Thank you for Providing the information");

        //Printing the details
        System.out.println("-----------------------------------------");
        System.out.println("Your Name: " + name);
        System.out.println("Your address: " + address);
        System.out.println("You have majored in: " + collegeMajor);
        System.out.println("Your Contact: " + telephoneNum);
        System.out.println("Your ZIP: " + zipCode);

    }
}
