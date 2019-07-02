import java.text.DecimalFormat;

public class SecondDay2 {
    public static void main(String[] args) {

        double a1 = 23.333555555;

        DecimalFormat df2 = new DecimalFormat("#.#####");
        System.out.println("double : " + df2.format(a1));    //3.14


    }
}
