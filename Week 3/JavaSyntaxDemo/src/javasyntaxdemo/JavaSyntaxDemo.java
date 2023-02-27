package javasyntaxdemo;
import java.util.Scanner;
public class JavaSyntaxDemo 
{
    public static void main(String[] args) 
    {
        Scanner input;
        input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String Name;
        
        int N, R;
        boolean flag;
        char Ch;
        
        while(true)
        {
            flag = true;
            System.out.print("What is Your Name : ");
            Name = input2.nextLine();
            System.out.print("Enter your Programming Grade : ");
            Ch = input2.nextLine().charAt(0);
            System.out.print("Hello "+Name+"! Enter a Number : ");
            N = input.nextInt();

            for(int i=2; i<N; i++)
            {
                if(N%i == 0)
                {
                    flag = false;
                    break;
                }
            }
            System.out.println("You got "+Ch+" Grade in Programming");
            if(flag == true)
                System.out.println("The Number "+N+" is PRIME");
            else
                System.out.println("The Number "+N+" is NOT A PRIME");
            
            System.out.print("Do you Want to Repeat (1/0) ? ");
            R = input.nextInt();
            if(R == 0)
                break;
        }
        
        
        
        
        
        
    }
    
}
