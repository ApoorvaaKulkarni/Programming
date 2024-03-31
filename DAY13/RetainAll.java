import java.util.HashSet;

public class RetainAll {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(3);
        h.add(4);
        System.out.println("HashSet1: " + h);
        HashSet<Integer> i = new HashSet<>();
        i.add(8);;
        i.add(3);
        System.out.println("HashSet2: " + i);
        h.retainAll(i);
        System.out.println("Intersection is: " + h);

    }
}
