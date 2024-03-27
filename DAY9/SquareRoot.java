import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Squareroot(n));
    }

    private static double Squareroot(int number) {
        double t;
        double squarer=number/2;
        do
        {
            t=squarer;
            squarer=(t+(number/t))/2;
        }
        while((t-squarer)!= 0);
        return squarer;

    }
}
