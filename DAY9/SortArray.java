import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n ; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements: ");
        for(int i =0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        int temp = 0;
        for(int i =0; i<arr.length;i++){
            for(int j = i + 1; j <arr.length;j++){
                if(arr[j] < arr[i] ){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("sorted array : ");
        for(int i =0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
