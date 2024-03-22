import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int Number = sc.nextInt();
        if(Number > 0){
            System.out.println("It is a positive integer");
        }
        else{
            System.out.println("It is a Negative integer");
        }
    }
}
