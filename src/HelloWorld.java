import java.util.*;
import java.util.stream.Collector; // last word upper case


public class HelloWorld {

    public static void main(String[] args) {
        int x = 10;
        int y = 25;
        int z = x + y;


        System.out.println("Sum of x+y = " + z);


        String goal = "I speak Java!";
        String name = "Julia";
        System.out.println("I am a smart student\n");
        System.out.println(name + "      speaks Java!" + " " + goal); // Concatenation = adding Strings with "+"
        System.out.println(name + goal);

        char a = 65;                   // Casting - automatically converting from one data type to other
        System.out.println(a);
        System.out.println(); // sysout Ctrl + space

        char b = 34;
        System.out.println(b);

        int a1 = 7;
        int b1 = 4;
        double d = a1 / b1;
        System.out.println(d);

        double k = 7d;
        int n = 4;
        d = k / n;
        System.out.println(d);

        int a2 = 5;
        int b2 = 2;
        double c2 = (double) (a2 / b2); // 2.0 result
        System.out.println(c2);

        char r = 'A';
        int p1 = r;
        int p2 = (int) r;

        System.out.println(p1 + " " + p2);
        System.out.println((char) 67);
        System.out.println((int) 'D');

        int winght = 50;
        int hight = 40;
        int area = winght * hight;
        System.out.println("Area is: " + area + " m2");


        final int a7 = 10;

        final double pi = 3.14;
        int radius = 2;
        double areaOfCircle = radius * radius * pi;
        System.out.println("Area of circle is " + areaOfCircle);


    }

}


