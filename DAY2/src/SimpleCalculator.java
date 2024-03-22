import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber: ");
        int A = sc.nextInt();
        System.out.println("Enter Second NUmber: ");
        int B = sc.nextInt();
        //product
        int Multiply = MultiplyNumber(A,B);
        System.out.println("Product of two numbers are : "+ Multiply);
        //Addition
        int Addition = AddNumbers(A,B);
        System.out.println("Addition of two Numbers is : " + Addition );
        //Subtraction
        int Subtracted = SubNumbers(A,B);
        System.out.println("Subracted number: " + Subtracted);
        //Division
        int Divide = DivideNum(A,B);
        System.out.println("Division of two numbers:" + Divide);
    }

    private static int DivideNum(int A, int B) {
        int DivNum =0;
        if(A > B){
            DivNum = A/B;
            System.out.println(DivNum);
        }else{
            DivNum= B/A;
            System.out.println(DivNum);
        }
        return DivNum;
    }

    private static int SubNumbers(int A, int B) {
        int SubNum = 0;
        if(A > B){
            SubNum = A - B;
            System.out.println(SubNum);
        }
        else{
            SubNum = B - A;
            System.out.println(SubNum);
        }
        return SubNum;
    }

    private static int AddNumbers(int A, int B) {
        int Sum = A + B;
        return Sum;
    }

    private static int MultiplyNumber(int A, int B) {
        int product = A * B;
        return product;
    }
}
