import java.util.Scanner;

public class SkipUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        for(int i =0; i<= s.length()- 1;i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                continue;
            }
            System.out.print(ch);
        }


    }
}
