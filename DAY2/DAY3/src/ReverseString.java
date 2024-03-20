import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String S = sc.next();
        System.out.print("Enter index: ");
        int endindex = sc.nextInt();
        String Reversed = StringReverse(S,endindex);
        System.out.println("Reversed String : " + Reversed);
    }

    public static String StringReverse(String S,int endindex) {
        String reverse = "";
        for(int i= S.length()-1;i>= 0;i--){
            char ch = S.charAt(i);
            reverse = reverse + ch;
            if (i == endindex) {
                break;
            }

        }

        return reverse;
    }
}
