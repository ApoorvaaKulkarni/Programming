import java.util.Scanner;

public class LargestOfthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the first element 2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the first element 3:");
        int n3 = sc.nextInt();
        int maxNum = n1;
        if(n2 > maxNum){
            maxNum = n2;

        }
        if(n3 > maxNum){
            maxNum = n3;
        }
        System.out.println("Largest Number is :" + maxNum);

    }
}
