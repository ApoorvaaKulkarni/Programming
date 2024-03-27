import java.util.Scanner;

public class SquareNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        Double square = n * n;
        System.out.println(String.format("square of %.2f is %.2f ", n , square));

    }
}
