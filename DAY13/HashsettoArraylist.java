import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsettoArraylist {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c");
        List<String> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
