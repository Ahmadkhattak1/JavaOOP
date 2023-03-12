import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of Cookies: ");
        double numOfCookies =  input.nextFloat();

        double sugar = 1.5f;
        double butter = 1;
        double flour = 2.75f;

        double oneCookieSugar = sugar / 48;
        double oneCookieButter = butter / 48;
        double oneCookieFlour = flour / 48;


        double userSugar = (numOfCookies * oneCookieSugar);
        double userButter = numOfCookies * oneCookieButter;
        double userFlour = numOfCookies * oneCookieFlour;


        System.out.println("Sugar: " + String.format("%.2f", userSugar));
        System.out.println("Butter: " + String.format("%.2f", userButter));
        System.out.println("Flour: " + String.format("%.2f", userFlour));


    }
}

