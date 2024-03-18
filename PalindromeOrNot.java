import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int Number = sc.nextInt();
        int digit = Number;
        int rev = 0;
        while(Number != 0){
            rev = rev * 10 + Number % 10;
            Number = Number / 10;

        }
        System.out.println(rev);

        if(rev == digit){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
