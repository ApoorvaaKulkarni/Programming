import java.util.Scanner;

public class SkipVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        for(int i =0 ; i<= s.length()-1; i ++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }

    }
}
