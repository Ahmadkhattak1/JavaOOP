import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        for(int number = 2; number <= 100; number++ ) {
            boolean isPrime = true;
            for(int i = 2; i<number; i++){
                if(number%i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
            }
        }
    }

}
