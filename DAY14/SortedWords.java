import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(",");
        TreeSet<String> sorted = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        sorted.addAll(Arrays.asList(words));
        System.out.println(" Sorted words ignoring duplicates");
        for(String word : sorted){
            System.out.print(word.trim() + ",");
        }
    }
}
