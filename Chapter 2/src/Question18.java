import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in); //So no characters of input stay in the streamline

        String name, city, animal, petName, profession, college;
        int age;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your Age: ");
        age = inputNum.nextInt();

        System.out.print("Enter your City: ");
        city = input.nextLine();

        System.out.print("Enter an Animal: ");
        animal = input.nextLine();

        System.out.print("Enter your Pet's Name: ");
        petName = input.nextLine();

        System.out.print("Enter your Profession: ");
        profession = input.nextLine();

        System.out.print("Enter your College Name: ");
        college = input.nextLine();

        System.out.println("There once was a person named " + name + " who lived in "+ city + ". At the age of "+age+",\n" +
                 name + " went to college at "+college+". " + name +" graduated and went to work as a\n" +
                profession + ". Then,"+name+ " adopted a(n) "+animal+" named "+petName+". They both lived\n" +
                "happily ever after!");

    }
}
