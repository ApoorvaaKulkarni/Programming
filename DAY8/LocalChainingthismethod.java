public class LocalChainingthismethod {
    public static void main(String[] args) {
        tests t = new tests();
        t.displays();

    }


    static class Test1 {
        int a, b;

        Test1(int a, int b) {
            this.a = a;
            this.b = b;
        }

        Test1() {
            a = 10;
            b = 20;
        }
    }

    static class Test2 extends Test1 {
        int x, y;

        Test2(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Test2() {
            x = 50;
            y = 60;
        }

        void display() {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }

    static class test {
        int m, n;

        test() {
            m = 100;
            n = 200;
        }

        test(int m, int n) {
            this.m = m;
            this.n = n;
        }
    }

    static class tests extends test {
        int c, d;

        tests() {
            this(9,99);
            c = 500;
            d = 600;
        }

        tests(int c, int d) {

            this.c = c;
            this.d = d;
        }

        void displays() {
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            System.out.println("m: " + m);
            System.out.println("n: " + n);
        }
    }
}



