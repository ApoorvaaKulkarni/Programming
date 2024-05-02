import java.util.Scanner;

public class CheckConsecutiveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = false;
        for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i+ 1)){
                    res = true;
                    break;
            }
        }
        if(res){
            System.out.println("true");
        }
        else{
            System.out.println("Fasle");
        }
    }
}
