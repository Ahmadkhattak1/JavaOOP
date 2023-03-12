import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        //creating a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Females: ");
        double female = input.nextDouble();

        System.out.print("Males: ");
        double male = input.nextDouble();

        double totalStudents = male+female;

        double totalMalePercentage = ((male/totalStudents) * 100);
        double totalFemalePercentage = ((female/totalStudents) * 100);

        System.out.println("Male Students are "+ Math.round(totalMalePercentage)+"%");
        System.out.println("Female Students are "+Math.round(totalFemalePercentage)+"%");

    }

}
