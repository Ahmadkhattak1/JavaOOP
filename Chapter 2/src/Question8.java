import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int calories = 30;

        //taking user input
        System.out.print("Enter the number of cookies: ");
        int numOfCookies = input.nextInt();

        System.out.println("You ate "+numOfCookies +" Cookies and the total calories you consumed were: " + numOfCookies*calories);

    }

}
