import java.util.Arrays;
import java.util.Scanner;

public class SumofevenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : (comma seperated numbers) :");
        String s = sc.nextLine();
        String[] words = s.split(",");
        int SumofEven = 0;
        for(String number : words){
            int num = Integer.parseInt(number);
            if(num % 2 == 0){
                SumofEven += num;
            }
        }
        System.out.println(SumofEven);
    }
}
