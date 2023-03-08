import java.util.Scanner;
public class Question2
{
    public static void main(String[] args)
    {
        // Creating a scanner object
        Scanner input = new Scanner(System.in);

        //initializing string variables
        String first_name, middle_name, last_name;

        //initializing Char variables
        char firstInitial, middleInitial, lastInitial;

        //getting the input from the user
        System.out.print("Enter your First Name: ");
        first_name = input.nextLine();
        System.out.print("Enter your Middle Name: ");
        middle_name = input.nextLine();
        System.out.print("Enter your Last Name: ");
        last_name = input.nextLine();

        //getting the initials
        firstInitial = first_name.charAt(0);
        middleInitial = middle_name.charAt(0);
        lastInitial = last_name.charAt(0);

        // declaring string variables to convert from Char to String

        String str_1, str_2, str_3;

        str_1 = String.valueOf(firstInitial);
        str_2 = String.valueOf(middleInitial);
        str_3 = String.valueOf(lastInitial);

        //printing the input with initials
        System.out.println("Your name is " + first_name+ " "+ middle_name + " "+ last_name +
        " and your Initials are: ");
        System.out.println(str_1.toUpperCase() + " " + str_2.toUpperCase() + " " + str_3.toUpperCase());


    }
}
