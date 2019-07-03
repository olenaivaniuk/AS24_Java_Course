import java.util.Scanner;

public class ThirdDay2 {
    public static void main(String[] args) {

        /*98. Ask 10 times the user for an age. If age is less than 10, say too young.
        If it is between 10 and 15, say game time, if it is more than 15 and less than 30 say time to work.
        Otherwise say time for travelling the world */

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 10;  i++) {
            System.out.println("Enter the age: ");
            int age = reader.nextInt();

            if (age < 10) {
                System.out.println("Too young!");
            }
            else if (age >= 10 && age <= 15) {
                System.out.println("Game time");
            }
            else if (age > 15 && age < 30) {
                System.out.println("Time to work");
            } else
                System.out.println("Time for travelling the world");


        }
    }
}
