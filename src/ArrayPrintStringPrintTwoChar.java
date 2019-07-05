import java.util.Scanner;

public class ArrayPrintStringPrintTwoChar {
    public static void main(String str[]) {

        String names[] = new String[5];
        for (int i = 0; i < names.length; i++) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Write your name: ");
            String name = reader.nextLine();
            names[i] = name;

        }
        String firstTwoChars = "";
        for (int i = 0; i < names.length; i++) {
            if(names[i].length() > 2) {
                firstTwoChars = names[i].substring(0, 2);
                System.out.println("First two characters in name is " + " [" + i + "] = " + firstTwoChars);
            }
            else
                System.out.println("Name is already has 2 characters " + " [" + i + "] = " + names[i]);

        }


        // get 5 names from the user and put them in array.
        // Go through the array and print 2 charachters from name, for example "Elena" -- >> "El"


    }
}
