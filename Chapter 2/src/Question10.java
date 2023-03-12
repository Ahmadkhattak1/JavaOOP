import java.util.Scanner;
public class Question10
{
    public static void main(String[] args)
    {
        //Creating a new scanner object
        Scanner input = new Scanner(System.in);

        //initializing accumulator
        double totalMarks = 0;

        //taking user input in a loop that iterates 3 times
        for(int i = 1; i <=3; i++){
            System.out.print("Enter your #"+i+" test result: ");
            double marks = input.nextDouble();
            totalMarks += marks;
        }
        //calculating the average
        double average = totalMarks/3;

        //converting to int when required
        if(average%1==0){
            System.out.println("Your average is: "+ (int)average);
        }
        else {
            System.out.println("Your average is: " + average);
        }

    }
}
