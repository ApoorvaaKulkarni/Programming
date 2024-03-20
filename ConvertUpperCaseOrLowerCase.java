import java.util.Scanner;

public class ConvertUpperCaseOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String upperCase = ToUpperCase(s);
        System.out.println("Converted lower case characters to upper case :" + upperCase);
        String LowerCase = ToLowerCase(s);
        System.out.println("Converted upper case characters to lower case :" +LowerCase);

    }

    private static String ToLowerCase(String s) {
        String t = "";
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>= 'A' && c<= 'Z'){
                t = t + (char)(s.charAt(i)+ 32);
            }else{
                t = t + c;
            }
        }return t;
    }

    private static String ToUpperCase(String s) {
        String t = "";
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                t = t + (char)(s.charAt(i) - 32);
            }
            else{
                t = t + c;
            }
        }
        return t;
    }

}
