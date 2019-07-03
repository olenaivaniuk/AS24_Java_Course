import java.util.Scanner;

public class ThirdDay3 {

    /*Ask  10 times for a number from user and print in the end the sum of numbers*/

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int summa = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number: ");
            int n = reader.nextInt();
            summa +=n;


        }
        System.out.println("Sum is: " + summa);

    }
}
