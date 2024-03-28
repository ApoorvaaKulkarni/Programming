import java.util.Scanner;

public class PrintStringMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3 == 0){
            System.out.println("TAP");
        }
        else if(n%5 == 0){
            System.out.println("Acad");
        } else if (n%3== 0 && n%5 == 0 ) {
            System.out.println("BTM");
        }
        else{
            System.out.println("not available");
        }
    }
}
