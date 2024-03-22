import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the charachter: ");
        String c = sc.next();
        char ch = c.charAt(0);
        if(ch == 'A' || ch == 'E' ||ch == 'I' || ch == 'O' ||ch == 'U'||ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u'){
            System.out.println(ch +" " + "is vowel");
        }else{
            System.out.println(ch +" "+  "is consonant");
        }



    }
}
