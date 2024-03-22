import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Connection is established");
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Enter numerator: ");
            int a = sc.nextInt();
            System.out.println("Enter the denominator: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);

        }
        catch(Exception e){
            System.out.println("provide non zero denominator");
        }
        System.out.println("connection terminated");
    }

}
