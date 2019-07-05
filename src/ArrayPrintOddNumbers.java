import java.util.Scanner;

public class ArrayPrintOddNumbers {
    public static void main(String str[]) {

        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Give me a number: ");
            int number = reader.nextInt();
            numbers[i] = number;

        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] %2 !=0) {
                System.out.println("Odd number" + " [" + i + "] = " + numbers[i]);
            }

        }


        // print only odd numbers from array [5]


    }
}
