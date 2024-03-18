import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter size");

        int n = sc.nextInt(); // n = 3
        int[] array = new int[n];

        System.out.println("\n Enter array elements");
        for(int i =0;i < n;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("\n Entered elements");
        for(int i =0; i< n;i++){
            System.out.print(array[i] + " ");

        }

        int temp = 0;
        for(int i =0; i < n ;i++){
            temp = array[0];
            if(array[i] > temp){
                temp = array[i];


            }

        }
        System.out.println("\nlargest number : " + temp);

    }
}
