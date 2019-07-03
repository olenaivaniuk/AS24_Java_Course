import java.util.Scanner;

public class ThirdDay1 {
    public static void main(String[] args) {

        /*9. Ask the age of the user and the name of the user and the number of cars the user has and
        the number of rooms his house has. If the user has a car,  then if he is older than 60 say good luck,
         otherwise if he is older than 20 say wow. If the user does not have a car,  ask for the transportation method he has and print it. */

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = reader.nextInt();
        reader.nextLine();

        System.out.println("Enter the name: ");
        String name = reader.nextLine();

        System.out.println("How many cars do you have?: ");
        int numberOfCars = reader.nextInt();
        reader.nextInt();

        /*System.out.println("How many rooms do you have in your flat? ");
        int numberOfRooms = reader.nextInt(); */

        if(age>60 && numberOfCars > 0) {
            System.out.println("Good luck! " + name);
        }
        else if (age > 20 && numberOfCars > 0) {
            System.out.println("Wow " + name);
        }
        else {
            System.out.println("What transport do you use?: ");
            String typeOfTransportation = reader.nextLine();
            System.out.println(name + "uses " + typeOfTransportation);

        }




    }
}
