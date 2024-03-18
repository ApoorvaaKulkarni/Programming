import java.util.Scanner;

public class DivisibleOrNOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter divisor");
        int Divisor = sc.nextInt();
        System.out.println("Enter Dividend");
        int Dividend = sc.nextInt();
        int Reminder = Dividend % Divisor;
        System.out.println(Reminder);
        if(Dividend % Divisor == 0){
            System.out.println(Dividend + " is divisible by" + " " + Divisor);
        }
        else{
            System.out.println("not divisible");
        }


    }
}
