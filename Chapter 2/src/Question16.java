import java.util.Scanner;
import java.text.DecimalFormat;
public class Question16
{
    public static void main(String[] args) {
        //creating a scanner object

        int surveyed = 12467;
        double shortlistedSurveyed = surveyed*0.14;

        System.out.println("People who purchase at least 1 energy drink per week are: "
                + Math.round(shortlistedSurveyed));
        System.out.println("Out of " + Math.round(shortlistedSurveyed) + ", "
                + Math.round(shortlistedSurveyed*0.64) + " people prefer Citrus Flavor");

    }
}
