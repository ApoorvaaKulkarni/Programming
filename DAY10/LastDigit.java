import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n % 10;
        if(t == 0){
            System.out.println("Zero present ");
        }
        else{
            System.out.println("Zero not present");
        }
    }
}