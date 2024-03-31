import java.util.HashSet;
import java.util.Set;

public class Hashcode {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Set.of("java", "python", "c"));
        System.out.println(set.hashCode());
    }
}
