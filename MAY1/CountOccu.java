import java.util.Scanner;

public class CountOccu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String b = sc.next().trim();
        int count = 0;
        if(s.length() >= b.length()){
            for(int i = 0; i <s.length() - b.length(); i++){
                if(s.substring(i, i +b.length()).equals(b)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
