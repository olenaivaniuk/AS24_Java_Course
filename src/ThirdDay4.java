import java.util.Scanner;

public class ThirdDay4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = reader.nextInt();
        int fac = 1;

        for (int i = 1; i <=n; i++) {
            fac *=i;


        }
         int a = 1*2*3*4*5*6*7*8;
        System.out.println("Factorial is: " + fac
        );


    }
}
