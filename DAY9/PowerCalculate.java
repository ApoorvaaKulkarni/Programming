import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int temp = 1;
        for(int i =1 ; i<= power; i ++){
            temp = temp * number ;
        }
        System.out.println(temp);
    }
}
