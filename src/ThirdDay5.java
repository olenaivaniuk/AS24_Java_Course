import java.util.Scanner;

public class ThirdDay5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = reader.nextInt();
        int sum = 0;

        for (int i = 0; i <=n; i++) {
            sum +=i;


        }
        System.out.println("Sum is: " + sum);


    }
}
