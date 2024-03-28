import java.util.Scanner;

public class EndsWith53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100 == 53){
            System.out.println("ENdswith 53");
        }else{
            System.out.println("does not ends with 53");
        }
    }
}
