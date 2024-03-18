import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = sc.nextInt();
        int rev = 0;
        while (Number != 0){
            rev = rev * 10 + Number%10;
            Number = Number/10;
        }
        System.out.println(rev);

    }
}
