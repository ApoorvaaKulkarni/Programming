import java.util.Scanner;

public class TwodigitorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int count = 0;
//        int temp = n;
//        while(temp != 0){
//            temp = temp /10;
//            count++;
//        }
//        if(count == 2){
//            System.out.println("2 digit");
//        }
//        else{
//            System.out.println("not two digit");
//        }
        if(n>9 && n<= 99){
            System.out.println("two digit");
        }
        else{
            System.out.println("not a two digit number");
        }



    }
}

