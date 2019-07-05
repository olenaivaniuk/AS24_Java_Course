import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayPrintAverage {
    public static void main(String str[]) {

        int numbers[] = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Give me a number: ");
            int number = reader.nextInt();
            numbers[i] = number;

        }
        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number" + " [" + i + "] = " + numbers[i]);
            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.println("Average is " +average);

        // average of numbers in array


    }
}
