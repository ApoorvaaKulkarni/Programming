import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp , reminder, sum = 0;
        temp = n;
        while(n > 0){
            reminder = n % 10;
            n = n /10;
            sum = sum + reminder * reminder * reminder;
        }
        System.out.println("sum is : " + sum);
        if(temp == sum){
            System.out.println("it is an amstrong number");
        }else{
            System.out.println("not an amstrong number");
        }

    }
}