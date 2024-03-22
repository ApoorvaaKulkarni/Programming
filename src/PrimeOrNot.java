import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int count = 0;
        if(Number > 1)
        {
            for(int i =1;i<= Number;i ++)
            {
                if(Number % i == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println((String.format("%d is a prime number", Number)));
            }
            else
            {
                System.out.println("not a prime number");
            }

        }

    }
}