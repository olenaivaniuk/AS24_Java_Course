import java.util.Scanner;

public class ThirdDay6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = reader.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <n; i++) {
            if(n % i ==0) {
                isPrime = false;
                break;
                }


              }
        if (isPrime == true){
            System.out.println("Is Prime");
        }
        else
            System.out.println("Not prime");



    }
}
