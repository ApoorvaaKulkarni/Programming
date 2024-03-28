import java.util.Scanner;

public class Specifiedindex {
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
        System.out.println("value of index 0 : "+ a[0]);
    }
}
