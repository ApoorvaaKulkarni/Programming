import java.util.Scanner;

public class specifiednumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements :");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("array: ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        int[] arr = new int[n- 1];
        for(int i =0;i<n-1;i++){
            arr[i] = a[i] + a[i+ 1];
        }
        System.out.println("sum array");
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
