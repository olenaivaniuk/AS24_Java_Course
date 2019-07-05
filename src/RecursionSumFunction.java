public class RecursionSumFunction {
    public static void main(String str[]) {
        System.out.println(sum(5));


    }

    static int sum (int n) {
        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        return sum(n-1) *n;
    }
}
