public class Test1 {
    int a;
    static int b;

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        t1.a = 100;
        t2.a = 200;

        System.out.println(t1.a);
        System.out.println(t2.a);

        t1.b =100;

        System.out.println(t1.b);
        System.out.println(t2.b);


        t2.b =200;

        Test1.b = t1.a;

        System.out.println(t1.b);
        System.out.println(t2.b);



    }


    }
