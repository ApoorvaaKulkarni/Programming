import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : " );
        int Year = sc.nextInt();
        //check if year is divisible by 4 but not by 100 or divisible by 400
        if((Year% 4 == 0 && Year% 100 != 0 )||(Year % 400 == 0))
        {
            System.out.println(Year + " " + "is a leap year");
        }else{
            System.out.println(Year+ " " + "is not a leap year");
        }
    }
}
