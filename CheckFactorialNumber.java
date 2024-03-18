import java.util.Scanner;

public class CheckFactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int factorial = 1;
        for(int i =1  ; i<=Number; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
