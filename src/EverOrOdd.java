import java.util.Scanner;

public class EverOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int Number = sc.nextInt();
        if(Number % 2 == 0){
            System.out.println("is a Even Number");
        }
        else{
            System.out.println("is Odd NUmber");
        }
    }


}
