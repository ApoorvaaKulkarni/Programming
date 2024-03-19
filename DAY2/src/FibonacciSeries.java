import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int Num = sc.nextInt();
        System.out.println("Fibonacci series for "+ Num );
        int NextValue = 0;
        int ZerothValue = 00;
        int FirstValue = 1;
        for(int i =1;i<= Num;i++){
            System.out.println(ZerothValue);
            NextValue = ZerothValue + FirstValue;
            ZerothValue = FirstValue;
            FirstValue = NextValue;
        }




    }
}
