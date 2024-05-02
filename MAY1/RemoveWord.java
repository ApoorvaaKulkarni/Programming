import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String remove = sc.nextLine();
        String res = s.replace(remove, "");
        res = res.replaceAll("\\s+", " ");
        System.out.println(res);

    }
}
