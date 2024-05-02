import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t  = " ";
        String[] word = s.split(" ");
        for(int i = 0; i <word.length; i++){
            if(word[i].length() %2 == 1){
                StringBuilder rev = new StringBuilder(word[i]);
                word[i] = rev.reverse().toString();
            }
        }
        System.out.println(String.join(" ", word));



    }
}