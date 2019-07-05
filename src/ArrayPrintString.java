import java.util.Scanner;

public class ArrayPrintString {
    public static void main(String str[]) {

        String names[] = new String[5];
        for (int i = 0; i < names.length; i++) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Write your name: ");
            String name = reader.nextLine();
            names[i] = name;

        }
        for (int i = 0; i < names.length; i++) {
            if(names[i].length() > 4) {
                System.out.println("Name that have more than 4 characters is" + " [" + i + "] = " + names[i]);
            }

        }


        // get 5 names from the user and put them in array.
        // Go through the array and print names that have more than 4 characters


    }
}
