import java.util.Scanner;

public class Endswith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%10 == 7){
            System.out.println("7 is present");
        }else{
            System.out.println("7 is not present");
        }
    }
}
