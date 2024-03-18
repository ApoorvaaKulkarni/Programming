import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = sc.nextInt();


        int reversedWhile = reverseNumberWhile(Number);
        System.out.println("using while loop : " +reversedWhile);

        int reversedFor = ForReverse(Number);
        System.out.println("using for loop : " + reversedFor);

        int ReccurssionReverse = ReverseReccur(Number,0);
        System.out.println("using Recurssion : " + ReccurssionReverse);







    }

    private static int ReverseReccur(int Number,int Rev) {
        if(Number == 0){
            return Rev;
        }
        return ReverseReccur(Number/10,Rev *10 + Number%10 );





    }

    private static int ForReverse(int Number) {
        int reverse = 0;
        for( ; Number != 0; Number /=10){
            reverse = reverse * 10 + Number % 10;


        }
        return reverse;
    }

    private static int reverseNumberWhile(int Number) {
        int rev = 0;
        while(Number != 0){
            rev = rev  * 10 + Number % 10;
            Number = Number / 10;
        }

        return rev;
    }
}
