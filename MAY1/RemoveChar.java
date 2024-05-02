import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = 'a';
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i =0 ; i< ch.length; i++){
            if(ch[i] != c){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
    }
}
