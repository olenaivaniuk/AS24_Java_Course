public class SecondDay3 {
    public static void main(String[] args) {
        int priceOfBook = 400;
        double finalPrice;

        if(priceOfBook < 50) {
            finalPrice  = priceOfBook - (priceOfBook*0.03);

        }
        else if (priceOfBook > 100) {
            finalPrice = priceOfBook - (priceOfBook*0.05);
        }
        else
            finalPrice = priceOfBook - (priceOfBook*0.01);

        System.out.println("Final price is " + finalPrice);

    }
}
