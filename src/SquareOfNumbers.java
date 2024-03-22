import java.util.Scanner;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements:");
        for(int i =0; i< n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("\nSquare of Entered elements");
        for(int i =0; i< n;i++){
            int square = array[i] * array[i];
            System.out.print(square + " ");
        }

    }
}
