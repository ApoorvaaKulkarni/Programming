import java.util.Scanner;

public class threedigitMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>99 && n<=999 && (n%10 == 0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
