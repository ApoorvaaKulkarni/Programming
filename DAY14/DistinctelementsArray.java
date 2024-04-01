import java.util.Scanner;
import java.util.TreeSet;

public class DistinctelementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements in array " );
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("array : ");
        for(int i = 0 ;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        TreeSet<Integer> dist = new TreeSet<>();
        for(int item : array){
            dist.add(item);
        }
        System.out.println("Distinct elements :" + dist);



    }
}
