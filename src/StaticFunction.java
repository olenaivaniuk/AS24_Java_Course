public class StaticFunction {
    int a;
    static int b;

    public static void main(String[] args) {
        StaticFunction t1 = new StaticFunction();
        StaticFunction t2 = new StaticFunction();

        t1.a = 100;
        t2.a = 200;

        System.out.println(t1.a);
        System.out.println(t2.a);

        t1.b =100;

        System.out.println(t1.b);
        System.out.println(t2.b);


        t2.b =200;

        StaticFunction.b = t1.a;

        System.out.println(t1.b);
        System.out.println(t2.b);



    }


    }
