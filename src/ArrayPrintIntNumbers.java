import java.util.Scanner;

public class ArrayPrintIntNumbers {
    public static void main(String str[]) {

        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Give me a number of charachters of your name: ");
            int number = reader.nextInt();
            numbers[i] = number;

        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 4) {
                System.out.println("Number of characters in name" + " [" + i + "] = " + numbers[i]);
            }

        }


        // get the length of chars from user (e.g. number 4)


    }
}
