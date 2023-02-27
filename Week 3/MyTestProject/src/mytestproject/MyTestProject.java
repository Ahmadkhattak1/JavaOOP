package mytestproject;
import java.util.Scanner;
public class MyTestProject
{

    public static void main(String[] args) 
    {
        System.out.println("Welcome to NETBEANs World");
        Scanner kb = new Scanner(System.in);
        int Marks;
        float GPA;
        System.out.print("Enter a Marks : ");
        Marks = kb.nextInt();
        
        System.out.print("Enter Your GPA : ");
        GPA = kb.nextFloat();
        
        System.out.println("Your Marks : "+Marks);
        System.out.println("Your GPA : "+ GPA);
        
        Scanner kbc = new Scanner(System.in);
        System.out.println("Enter your Grade : ");
        char Grade;
        Grade = kbc.nextLine().charAt(0);
        
        System.out.println("Your Grade is  : "+Grade);
        
    }
    
}
