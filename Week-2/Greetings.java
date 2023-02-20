import java.util.Scanner;
public class Greetings
{
	public static void main(String[] xyz)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome To Java World");
		String name;
		int age;
		char grade;

		System.out.print("Enter your name : ");
		name = input.nextLine();
		
		System.out.print("Enter yoru Grade : ");
		grade = input.nextLine().charAt(0);		

			
		System.out.print("Enter your age : ");
		age = input.nextInt();

		System.out.println("NAME : "+name);
		System.out.println("AGE  : "+age);		
		System.out.println("GRADE  : "+grade);		
		
	}
}