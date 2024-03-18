import java.util.Scanner;

public class SwapUsingAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        m = n + m;
        n = m - n;
        m = m - n;

        System.out.println("m after swapping : " + m);
        System.out.println("n after swapping : " + n);
    }
}
