import java.util.Scanner;

public class OccuranceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element k ");
        int k = sc.nextInt();
        int count =0;
        System.out.print("Enter array elements: ");
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements : ");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

        for(int i =0;i<arr.length;i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.println("number of times occured: "+ count);
    }
}
