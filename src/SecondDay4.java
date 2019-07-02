public class SecondDay4 {

    public static void main(String[] args) {
        int priceOfBook = 200;
        double finalPrice = 0;
        int age = 70;

        if (priceOfBook < 50) {
            finalPrice = priceOfBook - (priceOfBook * 0.03);

        } else if (priceOfBook > 100) {
            if (age < 5) {
                finalPrice = priceOfBook - (priceOfBook * 0.5);
            } else if (age > 80) {
                finalPrice = priceOfBook - (priceOfBook * 0.6);
            } else
                finalPrice = priceOfBook - (priceOfBook * 0.1);
        } else
            finalPrice = priceOfBook - (priceOfBook * 0.01);

        System.out.println("Final price is " + finalPrice);
    }
}
