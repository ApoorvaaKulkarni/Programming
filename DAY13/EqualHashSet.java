import java.util.HashSet;
import java.util.Set;

public class EqualHashSet {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        HashSet<String> s1 = new HashSet<>();
        s.add("java");
        s.add("python");
        s.add("c");
        s1.add("Golang");
        s1.add("c#");
        System.out.println(s.equals(s1));
    }
}
