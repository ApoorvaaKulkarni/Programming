import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String sentence = sc.nextLine();
//        assign count = 1, or else it will print one value less since there is no space after last word
        int count = 1;
        for(int i =0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                count = count + 1;
            }
        }

        System.out.print("Number of words in this semtence: " + count);


    }
}
