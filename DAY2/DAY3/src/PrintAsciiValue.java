import java.util.Scanner;

public class PrintAsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        String c = sc.next();
        if (c.length() == 1) {
            char ch = c.charAt(0);
            int ascii = (int)ch;
            System.out.println("ASCII value of " + c + " is " + ascii);
        }else{
            System.out.println("Enter valid character only");
        }



    }
}
