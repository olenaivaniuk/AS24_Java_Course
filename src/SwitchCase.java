import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Make of your car?: ");
        String makeOfCar = reader.nextLine();


        switch (makeOfCar) {
            case "BMW":
                System.out.println("You are BMW owner");
                break;
            case "Mercedes-Benz":
                System.out.println("You have Mercedes Benz");
                break;
            case "Ford":
                System.out.println("You are owner of Ford");
                break;
            default:
                System.out.println("You are owner of unpopular make of car");
        }
    }
}
