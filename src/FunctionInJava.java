import java.lang.Math.*;
import java.text.DecimalFormat;



public class FunctionInJava {
    public static void main(String[] args) {
        double areaCircle = calculateCircleArea(5);

        DecimalFormat df2 = new DecimalFormat("#.##");
        System.out.println("Area of Crcle is : " + df2.format(areaCircle));

        System.out.println("Minimun is " + calculateMinimum(4, 100));
        System.out.println("Average is " + calculateAverage(2, 5, 2));
        System.out.println("Number of Children is " + numberOfChildren(33, "Elena", 1.72));
        System.out.println("Character is " + function1(65));
        System.out.println("Number is " + function2('A'));
        System.out.println("Result with FOR " + powerCountWithFor(2, 8));
        System.out.println("Result with WHILE " + powerCountWithWhile(2, 8));
        System.out.println("Fibonacci is " + fibonacciCounter(7));
        System.out.println("Fib " + fib(7));


    }

    static double calculateCircleArea(double radius) {
        double area = radius * radius * Math.PI;
        return area;


    }

    static int calculateMinimum(int a1, int a2) {
        int min;
        if (a1 < a2) {
            min = a1;
        } else
            min = a2;
        return min;
    }

    static double calculateAverage(int a, int b, int c) {
        double average = (a + b + c) / 3;
        return average;
    }

    /*4. Write a method to get the age and the name and the height of the user and predict how many children he has
If the number of characters in his name is more than 6 and he is taller than 1.7 and is older than 40 then he has 5 children.
If the number of chars is between 4 and 6 and he is taller than 1.8 and he is older than 20 he has 2 children. Otherwise he has 3 children.
 */

    static int numberOfChildren(int age, String name, double height) {
        int numberOfChildren;
        if (name.length() > 6 && height > 1.7 && age > 40) {
            numberOfChildren = 5;

        } else if (name.length() >= 4 && name.length() <= 6 && height > 1.8 && age > 20) {
            numberOfChildren = 2;
        } else numberOfChildren = 3;
        return numberOfChildren;
    }

    /*Write a function that gets a number and returns its respective character. */

    static char function1(int a) {
        char character = (char) a;
        return character;
    }

    /*Write a function that gets a character and returns its ascii code */

    static int function2(char a) {
        int number = (int) a;
        return number;
    }

    static int powerCountWithFor(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;

    }

    static int powerCountWithWhile(int a, int b) {
        int result = 1;
        int i = 1;

        while (i <= b) {
            i += 1;
            result *= a;
        }
        return result;

    }

    static int fibonacciCounter(int n) {
        if (n == 1 || n == 2)
            return 1;

        int fn_1 = 0;
        int fn = 1;
        for (int i = 2; i <= n; i++) {
            int temp = fn;
            fn += fn_1;
            fn_1 = temp;


        }
        return fn;
    }

    static int fib(int n) {
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;


        return fib(n - 1) + fib(n - 2);


    }

}
