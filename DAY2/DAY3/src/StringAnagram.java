import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String one : ");
        String s1 = sc.next();
        System.out.print("Enter String two : ");
        String s2 = sc.next();
        if(s1.length() != s2.length()){
            System.out.println("Strings are not  anagram");
        }
        else{
            char[] charArray = s1.toCharArray();
            Arrays.sort(charArray);
            char[] charArray1 = s2.toCharArray();
            Arrays.sort(charArray1);
            for(int i =0; i< s1.length();i++){
                if(charArray[i] == charArray1[i]){


                }
            }
            System.out.println("Strings are anagrams");


        }
    }
}
