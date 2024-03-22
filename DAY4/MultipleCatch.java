import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator: ");
            int a = sc.nextInt();
            System.out.println("Enter the denominator: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
            System.out.println("Enter the size of the Array:");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the elements");
            int ele = sc.nextInt();
            System.out.println("Enter the index");
            int index = sc.nextInt();
            arr[index] = ele;
            arr = null;
            System.out.println(arr[index]);

        }
        catch(ArithmeticException ae){
            System.out.println("Provide non-zero denominator");
        }
        catch(NegativeArraySizeException nae){
            System.out.println("Provide positive array size index");
        }
        catch(InputMismatchException ime){
            System.out.println("provide only integers");
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("provide valid index");
        }
        catch(Exception e){
            System.out.println("Invalid input.Try Again");
        }
        System.out.println("Connection is terminated");
    }
}
