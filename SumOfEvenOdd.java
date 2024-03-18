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
        System.out.println("Numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }


        int SumEven = 0;
        int SumOdd = 0;

        System.out.println("\nEven Numbers");
        for (int i = 0; i < n; i++) {

            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                SumEven += a[i];




            }

        }
        System.out.println("\nSum of even : " + SumEven);

        System.out.println("\nodd NUmbers");
        for(int i =0 ; i<n;i++){

            if(a[i] %2 != 0){
                System.out.print(a[i] + " ");
                SumOdd += a[i];


            }
        }
        System.out.println("\n sum of odd " + SumOdd);




    }
}




