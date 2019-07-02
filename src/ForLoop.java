import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i < 14; i= i+ 3){
            System.out.print(i + " ");

        }
        System.out.println();

        for(int i = -10; i < -2; i= i+ 2){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i > -8; i= i- 2){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = 2; i < 100; i= i*3){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = 10; i >=1; i= i-1){
            System.out.print(i + " ");
        }

        System.out.println();

        Scanner reader = new Scanner(System.in);

        for(int i = 1; i <10; i= i+1){
            System.out.println("Give me a number?: ");
            int n = reader.nextInt();
            if(n % 2 != 0) {
                System.out.println("odd");
            }
            else System.out.print("even \n");
        }
    }
}
