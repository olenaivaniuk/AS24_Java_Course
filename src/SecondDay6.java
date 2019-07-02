import java.util.Scanner;

public class SecondDay6 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?: ");
        int ageOfCarOwner = reader.nextInt();
        reader.nextLine();                       // we need to have ths line after int/double before String

        System.out.println("Make of your car?: ");
        String makeOfCar = reader.nextLine();

        System.out.println("How old are your car?: ");
        int ageOfCar = reader.nextInt();

        System.out.println("How many children do you have?: ");
        int numberOfChildren = reader.nextInt();


        if (ageOfCar >= 5 && ageOfCarOwner >= 50) {
            if (makeOfCar.equals("BMW")) {
                System.out.println("You are the old owner of old BMW");
            }
            else if(makeOfCar.equals("Ford")) {
                System.out.println("You are the old owner of old Ford");
            }
                System.out.println("You don't have BMW or Ford");

        } else if (ageOfCar < 5 && ageOfCarOwner < 50) {
            if(numberOfChildren == 0) {
                System.out.println("You are young and happy!");
            }
            else
                System.out.println("You have a family");

        }
        else System.out.println("ERROR!!! TRY AGAIN WITH OTHER SET OF DATA");

    }

}


