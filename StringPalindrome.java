import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        boolean palindrome = PalindromeString(s);
        if(palindrome == true){
            System.out.println("\nGiven String is a palindrome");
        }else{
            System.out.println("\nGiven String is not a palindrome");
        }

    }
//    count the number of characters
//    check if string contains any specific character using .contains() menthod
//check if original string is same as reversed string to check that use .equals() method
    private static boolean PalindromeString(String s) {
        String reversed = "";
        int count = 0;
        for(int i =s.length()-1;i>= 0;i--){
            char ch = s.charAt(i);
            reversed = reversed + ch;
            count++;
        }
        if(reversed.contains("m")){
            System.out.println("Contains  character m ");

        }
        System.out.print("number of characters present in string: " + count);
        return s.equals(reversed);
    }
}
