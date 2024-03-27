import java.util.Scanner;

public class CapitalizeFirstletter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "";
        for(int i= 0;i <s.length();i++){
            char ch = s.charAt(i);
            if (i == 0 &&  (ch>= 'a' && ch<='z')){
                ch = (char)(ch - 32);

            }

            t = t + ch;

        }
        System.out.println(t);

    }
}
