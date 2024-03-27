import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        for(int i =0;i< s.length();i++){
            char ch = s.charAt(i);
            if((ch>= 'a' && ch<= 'z') || (ch >= 'A' && ch<= 'Z') || (ch>= '0' && ch<='9')){
                System.out.println(ch);

            }else{
                continue;
            }
        }
    }
}
