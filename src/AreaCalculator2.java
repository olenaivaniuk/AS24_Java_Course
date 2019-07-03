
public class AreaCalculator2 {

    public static void main(String[] args) {
        double area = computeArea(2, 3);
        System.out.println("Area is " + area);
        System.out.println(computeArea(4, 3));

    }

    static double computeArea(double height, double width) {
        double area = height * width;
        return area;
    }
}
