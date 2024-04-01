import java.util.NavigableSet;
import java.util.TreeSet;

public class ReversedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(8);
        t.add(1);
        t.add(34);
        t.add(12);
        System.out.println("original treeset : "+ t);
        NavigableSet<Integer> reversedOrder = t.descendingSet();
        System.out.println("Reversed order : " + reversedOrder);
    }
}
