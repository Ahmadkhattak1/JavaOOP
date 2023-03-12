import java.util.Scanner;
public class Question12
{
    public static void main(String[] args) {
        //Creating a scanner object

        Scanner input = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter the name of your City: ");
        String city = input.nextLine();

        //Displaying the information
        System.out.println("-----------------------------------");
        System.out.println("Number of Characters: " + city.length());
        System.out.println("Uppercase: " + city.toUpperCase());
        System.out.println("Lowercase: " + city.toLowerCase());
        System.out.println("The first character: "+ city.charAt(0));

    }
}
