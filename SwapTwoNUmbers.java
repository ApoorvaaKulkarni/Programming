import java.util.Scanner;

public class SwapTwoNUmbers {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter First Number: ");
        int First = sc.nextInt();
        System.out.println("\n Enter Second Number: ");
        int second = sc.nextInt();

        temp = First;
        First = second;
        second = temp;
        System.out.println("First value is : " + First + " " + "Second Value is : " + " " + second);




    }
}
