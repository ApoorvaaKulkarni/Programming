import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }


        Arrays.sort(strings, Comparator.comparingInt(String::length));


        System.out.println("Sorted in ascending order of lengths:");
        for (String str : strings) {
            System.out.println(str);
        }


        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());


        System.out.println("Sorted in descending order of lengths:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
