import java.util.Scanner;
import java.lang.Math;

public class SecondDay5 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your age:");
        double age = reader.nextDouble();

        System.out.println("Enter the book price in €:");
        double price = reader.nextDouble();
        double finalPrice;
        double discount = 0;

        if (price < 50) {
            discount = 3;

        } else if (price > 100) {
            if (age < 5) {
                discount = 50;

            } else if (age > 80) {
                discount = 60;
            } else {
                discount = 10;
            }
        } else {
            discount = 1;
        }
        finalPrice = price * (100 - discount) / 100;
        System.out.println("Congratulations, you get " + discount + "% discount! Therefore, you just have to pay " + finalPrice + "€ :)");

    }
}