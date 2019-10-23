import java.util.Scanner;

public class Userinputex {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        String retval;
        char firstInitial = 'P';
        System.out.println("Enter your first initial");
        retval = keyboard.nextLine();
        firstInitial = retval.charAt(0);

        String lastName = "Sherman";
        System.out.println("Enter your last name");
        lastName = keyboard.nextLine();

        int houseNumber = 42;
        System.out.println("Enter your house number");
        houseNumber = keyboard.nextInt();

        String streetName = "Wallaby";
        System.out.println("Enter your street name");
        streetName = keyboard.nextLine();

        String streetType = "Way";
        System.out.println("Enter your street type");
        streetType = keyboard.nextLine();

        String city = "Sydney";
        System.out.println("Enter your city");
        city = keyboard.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
