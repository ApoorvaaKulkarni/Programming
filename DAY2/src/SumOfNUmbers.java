import java.util.Scanner;

public class SumOfNUmbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Num = sc.nextInt();
        int sum = 0;
        int i =0;
        while ( i <= Num){
            sum= sum + i;
            i++;
        }
        System.out.println("Sum of Numbers : " + sum);
    }
}
