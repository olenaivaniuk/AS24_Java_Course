import java.util.Scanner;

public class ExceptionClass {

    public static void main(String str[]) throws Exception {

        int number = getCharLength();

        System.out.println("continueing");

    }

    static int getCharLength() throws Exception {
        int number = -1;
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Give me number");
            number = reader.nextInt();
        } catch (Exception e) {
            System.out.println("Exception happened");
        }
        reader.close();


        return number;

    }


}
