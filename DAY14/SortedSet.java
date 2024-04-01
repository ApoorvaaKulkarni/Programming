import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        System.out.println("original set : " + s);
        System.out.println("Headset : " + s.headSet("c"));;
        System.out.println("Subset: " + s.subSet("a","e"));
        System.out.println("Tailset : " + s.tailSet("c"));
    }
}
