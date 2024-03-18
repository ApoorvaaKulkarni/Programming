import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=  new int[n];
        System.out.print("enter : ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }

        System.out.println("\nEven Numbers");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\nodd NUmbers");
        for(int i =0 ; i<n;i++){
            if(a[i] %2 != 0){
                System.out.print(a[i] + " ");
            }
        }




    }
}
