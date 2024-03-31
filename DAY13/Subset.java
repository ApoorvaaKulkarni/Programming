import java.util.HashSet;

public class Subset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        System.out.println("HashSet1: " + h);
        HashSet<Integer> i = new HashSet<>();
        i.add(5);
        i.add(4);
        System.out.println(i);
        boolean result = h.containsAll(i);
        System.out.println("is Hashset2 is subset of hashset1 ?  " + result);
    }
}
