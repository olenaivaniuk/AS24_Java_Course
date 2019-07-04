import java.util.Scanner;

public class ArrayClass {
    public static void main(String str[]) {

        double a = 3;
        double b = 5;

        double min = findMin(a,b);
        System.out.println(min);


        Scanner reader = new Scanner(System.in);
        System.out.println("Give me name, hight, age");
        String input = reader.nextLine();
        String[] answer = input.split(" ");
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
        int age = Integer.parseInt(answer[2]);
        System.out.println(age);




    }

    static double findMin(double a, double b) {
        if(a>b) {
            return b;
        }
        return a;
    }

}