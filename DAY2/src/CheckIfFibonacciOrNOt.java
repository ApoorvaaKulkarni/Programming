import java.util.Scanner;

public class CheckIfFibonacciOrNOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        boolean isFibonacci = PerfectSquare(Number);
        if(isFibonacci == true){
            System.out.println("is a Fibonacci");;
        }
        else{
            System.out.println("is not a Fibonacci");
        }


    }

    private static boolean PerfectSquare(int Number) {
        int i = (Number * Number);
        return (((5 * i) + 4) == 0) || (((5 * i) - 4) == 0);

    }
}
