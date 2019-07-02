public class Javar {



        public static void main(String[] args) {
            int a = 5;
            int b = 2;
            int c = ++a + b; //6+2 = 8
            c *=2; // 8*2 = 16
            c = --a+2; // 5-1 +2
            c /=2;
            c ++;
            ++c;
            c = ++b;
            c=1;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);


            int q =0, w=0;
            q = ++w + w++ * (w++ + w);

            System.out.println(q + " " + w);
}
}

