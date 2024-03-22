import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        String t = " ";
        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            t = t + ch;
        }
        System.out.print("Reversed String: " + t);
    }
}
