import java.util.Scanner;

public class ElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] a = {1,5,8,3,9,4,3};
        for(int i =0; i< a.length;i++){
            if(n == a[i]){
                System.out.println(String.format("index value of %d is : ", n)+  i);
            }
        }
    }
}
